package CylvreCompiler.bytecodegeneration;

import Cylvre.util.DescriptorFactory;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.Constructor;
import Cylvre.domain.Function;
import Cylvre.domain.node.expression.EmptyExpression;
import Cylvre.domain.node.expression.SuperCall;
import Cylvre.domain.node.statement.Block;
import Cylvre.domain.node.statement.ReturnStatement;
import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.scope.CylvreScopes;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class MethodGenerator {
    public static final String MAIN_FUN_NAME = "main";
    private final ClassWriter classWriter;

    public MethodGenerator(ClassWriter classWriter) {
        this.classWriter = classWriter;
    }

    public void generate(Function function) {
        String name = function.getName();
        boolean isMain = name.equals(MAIN_FUN_NAME);
        String description = DescriptorFactory.getMethodDescriptor(function);
        Block block = (Block) function.getRootStatement();
        CylvreScopes scope = block.getScope();
        int access = Opcodes.ACC_PUBLIC + (isMain ? Opcodes.ACC_STATIC : 0);
        String functionDescription = (isMain ? "([Ljava/lang/String;)V" : description);
        MethodVisitor mv = classWriter.visitMethod(access, name, functionDescription, null, null);
        mv.visitCode();
        StatementGenerator statementScopeGenerator = new StatementGenerator(mv,scope);
        block.accept(statementScopeGenerator);
        appendReturnIfNotExists(function, block,statementScopeGenerator);
        mv.visitMaxs(-1,-1);
        mv.visitEnd();
    }

    public void generate(Constructor constructor) {
        Block block = (Block) constructor.getRootStatement();
        CylvreScopes  scope = block.getScope();
        int access = Opcodes.ACC_PUBLIC;
        String description = DescriptorFactory.getMethodDescriptor(constructor);
        MethodVisitor mv = classWriter.visitMethod(access, "<init>", description, null, null);
        mv.visitCode();
        StatementGenerator statementScopeGenerator = new StatementGenerator(mv,scope);
        new SuperCall().accept(statementScopeGenerator);
        block.accept(statementScopeGenerator);
        appendReturnIfNotExists(constructor, block,statementScopeGenerator);
        mv.visitMaxs(-1,-1);
        mv.visitEnd();
    }

    private void appendReturnIfNotExists(Function function, Block block,StatementGenerator statementScopeGenrator) {
        boolean isLastStatementReturn = false;
        if(!block.getStatements().isEmpty()) {
            Statement lastStatement = block.getStatements().get(block.getStatements().size() - 1);
            isLastStatementReturn = lastStatement instanceof ReturnStatement;
        }
        if(!isLastStatementReturn) {
            EmptyExpression emptyExpression = new EmptyExpression(function.getReturnType());
            ReturnStatement returnStatement = new ReturnStatement(emptyExpression);
            returnStatement.accept(statementScopeGenrator);
        }
    }
}
