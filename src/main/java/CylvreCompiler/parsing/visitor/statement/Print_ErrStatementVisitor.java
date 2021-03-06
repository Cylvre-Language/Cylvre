package CylvreCompiler.parsing.visitor.statement;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.statement.Print_ErrStatement;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;
import org.jetbrains.annotations.NotNull;

public class Print_ErrStatementVisitor extends CylvreBaseVisitor<Print_ErrStatement> {
    private final ExpressionVisitor expressionVisitor;

    public Print_ErrStatementVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public Print_ErrStatement visitPrint_errStatement(@NotNull CylvreParser.Print_errStatementContext ctx) {
        CylvreParser.ExpressionContext expressionCtx = ctx.expression();
        Expression expression = expressionCtx.accept(expressionVisitor);
        return new Print_ErrStatement(expression);
    }
}
