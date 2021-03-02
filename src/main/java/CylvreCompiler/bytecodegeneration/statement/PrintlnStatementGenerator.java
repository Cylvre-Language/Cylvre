package CylvreCompiler.bytecodegeneration.statement;

import Cylvre.domain.node.statement.PrintlnStatement;
import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.type.Type;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class PrintlnStatementGenerator {
    private final MethodVisitor methodVisitor;
    private final ExpressionGenerator expressionGenerator;

    public PrintlnStatementGenerator(ExpressionGenerator expressionGenerator, MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
        this.expressionGenerator = expressionGenerator;
    }

    public void generate(PrintlnStatement printLnStatement) {
        Expression expression = printLnStatement.getExpression();
        String descriptor;
        Type type;
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");

        if (expression != null) {
            expression.accept(expressionGenerator);
            type = expression.getType();
            descriptor = "(" + type.getDescriptor() + ")V";
        } else {
            descriptor = "()V";
        }

        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", descriptor);
    }
}