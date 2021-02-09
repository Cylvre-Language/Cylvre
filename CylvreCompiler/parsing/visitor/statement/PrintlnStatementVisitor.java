package CylvreCompiler.parsing.visitor.statement;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.statement.PrintlnStatement;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

public class PrintlnStatementVisitor extends CylvreBaseVisitor<PrintlnStatement> {
    private final ExpressionVisitor expressionVisitor;

    public PrintlnStatementVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public PrintlnStatement visitPrintlnStatement(@NotNull CylvreParser.PrintlnStatementContext ctx) {
        CylvreParser.ExpressionContext expressionCtx = ctx.expression();
        Expression expression = expressionCtx.accept(expressionVisitor);
        return new PrintlnStatement(expression);
    }
}