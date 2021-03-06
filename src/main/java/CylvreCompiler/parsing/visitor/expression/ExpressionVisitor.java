package CylvreCompiler.parsing.visitor.expression;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.domain.node.expression.ConditionalExpression;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.scope.CylvreScopes;
import CylvreCompiler.parsing.visitor.expression.function.CallExpressionVisitor;
import org.jetbrains.annotations.NotNull;

public class ExpressionVisitor extends CylvreBaseVisitor<Expression> {

    private final ArithmeticExpressionVisitor arithmeticExpressionVisitor;
    private final VariableReferenceExpressionVisitor variableReferenceExpressionVisitor;
    private final ValueExpressionVisitor valueExpressionVisitor;
    private final CallExpressionVisitor callExpressionVisitor;
    private final ConditionalExpressionVisitor conditionalExpressionVisitor;

    public ExpressionVisitor(CylvreScopes scope) {
        arithmeticExpressionVisitor = new ArithmeticExpressionVisitor(this);
        variableReferenceExpressionVisitor = new VariableReferenceExpressionVisitor(scope);
        valueExpressionVisitor = new ValueExpressionVisitor();
        callExpressionVisitor = new CallExpressionVisitor(this, scope);
        conditionalExpressionVisitor = new ConditionalExpressionVisitor(this);
    }

    @Override
    public Expression visitVarReference(@NotNull CylvreParser.VarReferenceContext ctx) {
        return variableReferenceExpressionVisitor.visitVarReference(ctx);
    }

    @Override
    public Expression visitValue(@NotNull CylvreParser.ValueContext ctx) {
        return valueExpressionVisitor.visitValue(ctx);
    }

    @Override
    public Expression visitFunctionCall(@NotNull CylvreParser.FunctionCallContext ctx) {
        return callExpressionVisitor.visitFunctionCall(ctx);
    }

    @Override
    public Expression visitConstructorCall(@NotNull CylvreParser.ConstructorCallContext ctx) {
        return callExpressionVisitor.visitConstructorCall(ctx);
    }

    @Override
    public Expression visitSuperCall(@NotNull CylvreParser.SuperCallContext ctx) {
        return callExpressionVisitor.visitSuperCall(ctx);
    }

    @Override
    public Expression visitAdd(@NotNull CylvreParser.AddContext ctx) {
        return arithmeticExpressionVisitor.visitAdd(ctx);
    }

    @Override
    public Expression visitMultiply(@NotNull CylvreParser.MultiplyContext ctx) {
        return arithmeticExpressionVisitor.visitMultiply(ctx);
    }

    @Override
    public Expression visitSubtract(@NotNull CylvreParser.SubtractContext ctx) {
        return arithmeticExpressionVisitor.visitSubtract(ctx);
    }

    @Override
    public Expression visitDivide(@NotNull CylvreParser.DivideContext ctx) {
        return arithmeticExpressionVisitor.visitDivide(ctx);
    }

    @Override
    public ConditionalExpression visitConditionalExpression(@NotNull CylvreParser.ConditionalExpressionContext ctx) {
        return conditionalExpressionVisitor.visitConditionalExpression(ctx);
    }
}
