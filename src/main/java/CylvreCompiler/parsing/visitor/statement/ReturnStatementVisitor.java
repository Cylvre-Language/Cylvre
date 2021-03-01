package CylvreCompiler.parsing.visitor.statement;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.domain.node.expression.EmptyExpression;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.statement.ReturnStatement;
import Cylvre.domain.type.BuiltInType;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;
import org.jetbrains.annotations.NotNull;

public class ReturnStatementVisitor extends CylvreBaseVisitor<ReturnStatement> {
    private final ExpressionVisitor expressionVisitor;

    public ReturnStatementVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public ReturnStatement visitReturnVoid(@NotNull CylvreParser.ReturnVoidContext ctx) {
        return new ReturnStatement(new EmptyExpression(BuiltInType.VOID));
    }

    @Override
    public ReturnStatement visitReturnWithValue(@NotNull CylvreParser.ReturnWithValueContext ctx) {
        Expression expression = ctx.expression().accept(expressionVisitor);
        return new ReturnStatement(expression);
    }
}