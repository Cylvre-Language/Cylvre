package CylvreCompiler.parsing.visitor.expression;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.expression.arithmetic.*;
import org.jetbrains.annotations.NotNull;

public class ArithmeticExpressionVisitor extends CylvreBaseVisitor<ArithmeticExpression> {
    private final ExpressionVisitor expressionVisitor;

    public ArithmeticExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public ArithmeticExpression visitAdd(@NotNull CylvreParser.AddContext ctx) {
        CylvreParser.ExpressionContext leftExpression = ctx.expression(0);
        CylvreParser.ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);

        return new Addition(leftExpress, rightExpress);
    }

    @Override
    public ArithmeticExpression visitMultiply(@NotNull CylvreParser.MultiplyContext ctx) {
        CylvreParser.ExpressionContext leftExpression = ctx.expression(0);
        CylvreParser.ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);

        return new Multiplication(leftExpress, rightExpress);
    }

    @Override
    public ArithmeticExpression visitSubtract(@NotNull CylvreParser.SubtractContext ctx) {
        CylvreParser.ExpressionContext leftExpression = ctx.expression(0);
        CylvreParser.ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);

        return new Subtraction(leftExpress, rightExpress);
    }

    @Override
    public ArithmeticExpression visitDivide(@NotNull CylvreParser.DivideContext ctx) {
        CylvreParser.ExpressionContext leftExpression = ctx.expression(0);
        CylvreParser.ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);

        return new Division(leftExpress, rightExpress);
    }
}