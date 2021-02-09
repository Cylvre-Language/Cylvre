package CylvreCompiler.bytecodegeneration.statement;

import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.statement.VariableDeclaration;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.type.ClassType;
import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.List;

public class ArrayDeclarationStatementGenerator {
    private final ExpressionGenerator expressionGenerator;
    private final MethodVisitor methodVisitor;
    private final CylvreScopes scope;

    public ArrayDeclarationStatementGenerator(ExpressionGenerator expressionGenerator,      MethodVisitor methodVisitor, CylvreScopes scope){
        this.expressionGenerator = expressionGenerator;
        this.methodVisitor = methodVisitor;
        this.scope = scope;
    }

    public void generate(VariableDeclaration variableDeclaration){
        String name = variableDeclaration.getName();
        ClassType type = (ClassType) variableDeclaration.getType();
        List<Expression> expressions = variableDeclaration.getExpressions();
        methodVisitor.visitTypeInsn(Opcodes.NEWARRAY, type.getInternalName());
        expressions.forEach(e -> e.accept(expressionGenerator));
        methodVisitor.visitVarInsn(Opcodes.ASTORE, scope.getLocalVariableIndex(name));

    }
}
