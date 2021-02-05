package CylvreCompiler.bytecodegeneration.statement;

import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.statement.PrintStatement;
import Cylvre.domain.type.Type;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class PrintStatementGenerator {
    private final MethodVisitor methodVisitor;
    private final ExpressionGenerator expressionGenerator;

    public PrintStatementGenerator(ExpressionGenerator expressionGenerator, MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
        this.expressionGenerator = expressionGenerator;
    }

    public void generate(PrintStatement printStatement) {
        Expression expression = printStatement.getExpression();
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        expression.accept(expressionGenerator);
        Type type = expression.getType();
        String descriptor = "(" + type.getDescriptor() + ")V";
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", descriptor);
    }
}