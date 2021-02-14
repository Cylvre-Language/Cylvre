package CylvreCompiler.bytecodegeneration.statement;

import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.statement.Print_ErrStatement;
import Cylvre.domain.type.Type;
import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class Print_ErrStatementGenerator {
    private final MethodVisitor methodVisitor;
    private final ExpressionGenerator expressionGenerator;

    public Print_ErrStatementGenerator(ExpressionGenerator expressionGenerator, MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
        this.expressionGenerator = expressionGenerator;
    }

    public void generate(Print_ErrStatement print_errStatement) {
        Expression expression = print_errStatement.getExpression();
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
        expression.accept(expressionGenerator);
        Type type = expression.getType();
        String descriptor = "(" + type.getDescriptor() + ")V";
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", descriptor);
    }
}
