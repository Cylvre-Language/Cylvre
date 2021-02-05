package CylvreCompiler.bytecodegeneration.expression;

import Cylvre.domain.node.expression.*;
import Cylvre.domain.node.expression.arthimetic.Addition;
import Cylvre.domain.node.expression.arthimetic.Division;
import Cylvre.domain.node.expression.arthimetic.Multiplication;
import Cylvre.domain.node.expression.arthimetic.Subtraction;
import Cylvre.domain.scope.CylvreScopes;
import org.objectweb.asm.MethodVisitor;

public class ExpressionGenerator {


    private final ReferenceExpressionGenerator referenceExpressionGenerator;
    private final ValueExpressionGenerator valueExpressionGenerator;
    private final CallExpressionGenerator callExpressionGenerator;
    private final ArithmeticExpressionGenerator arithmeticExpressionGenerator;
    private final ConditionalExpressionGenerator conditionalExpressionGenerator;
    private final ParameterExpressionGenerator parameterExpressionGenerator;

    public ExpressionGenerator(MethodVisitor methodVisitor, CylvreScopes scope) {
        referenceExpressionGenerator = new ReferenceExpressionGenerator(methodVisitor,scope);
        valueExpressionGenerator = new ValueExpressionGenerator(methodVisitor);
        callExpressionGenerator = new CallExpressionGenerator(this, scope, methodVisitor);
        arithmeticExpressionGenerator = new ArithmeticExpressionGenerator(this, methodVisitor);
        conditionalExpressionGenerator = new ConditionalExpressionGenerator(this, methodVisitor);
        parameterExpressionGenerator = new ParameterExpressionGenerator(methodVisitor, scope);
    }

    public void generate(FieldReference reference) {
        referenceExpressionGenerator.generate(reference);
    }

    public void generate(LocalVariableReference reference) {
        referenceExpressionGenerator.generate(reference);
    }

    public void generate(Parameter parameter) {
        parameterExpressionGenerator.generate(parameter);
    }

    public void generate(Value value) {
        valueExpressionGenerator.generate(value);
    }

    public void generate(ConstructorCall constructorCall) {
        callExpressionGenerator.generate(constructorCall);
    }

    public void generate(SuperCall superCall) {
        callExpressionGenerator.generate(superCall);
    }

    public void generate(FunctionCall functionCall) {
        callExpressionGenerator.generate(functionCall);
    }

    public void generate(Addition expression) {
        arithmeticExpressionGenerator.generate(expression);
    }

    public void generate(Subtraction expression) {
        arithmeticExpressionGenerator.generate(expression);
    }

    public void generate(Multiplication expression) {
        arithmeticExpressionGenerator.generate(expression);
    }

    public void generate(Division expression) {
        arithmeticExpressionGenerator.generate(expression);
    }

    public void generate(ConditionalExpression conditionalExpression) {
        conditionalExpressionGenerator.generate(conditionalExpression);
    }

    public void generate(EmptyExpression emptyExpression) {
        //do nothing ;)
    }

}
