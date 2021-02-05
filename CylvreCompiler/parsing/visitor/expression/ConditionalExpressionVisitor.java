package CylvreCompiler.parsing.visitor.expression;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.domain.CompareSign;
import Cylvre.domain.node.expression.ConditionalExpression;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.expression.Value;
import Cylvre.domain.type.BuiltInType;
import org.antlr.v4.runtime.misc.NotNull;

public class ConditionalExpressionVisitor extends CylvreBaseVisitor<ConditionalExpression> {
    private final ExpressionVisitor expressionVisitor;

    public ConditionalExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public ConditionalExpression visitConditionalExpression(@NotNull CylvreParser.ConditionalExpressionContext ctx) {
        CylvreParser.ExpressionContext leftExpressionCtx = ctx.expression(0);
        CylvreParser.ExpressionContext rightExpressionCtx = ctx.expression(1);
        Expression leftExpression = leftExpressionCtx.accept(expressionVisitor);
        Expression rightExpression = rightExpressionCtx != null ? rightExpressionCtx.accept(expressionVisitor) : new Value(BuiltInType.INT, "0");
        CompareSign cmpSign = ctx.cmp != null ? CompareSign.fromString(ctx.cmp.getText()) : CompareSign.NOT_EQUAL;
        return new ConditionalExpression(leftExpression, rightExpression, cmpSign);
    }
}