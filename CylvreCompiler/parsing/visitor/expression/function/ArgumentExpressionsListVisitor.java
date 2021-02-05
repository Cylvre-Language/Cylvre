package CylvreCompiler.parsing.visitor.expression.function;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.domain.node.expression.Argument;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ArgumentExpressionsListVisitor extends CylvreBaseVisitor<List<Argument>> {
    private final ExpressionVisitor expressionVisitor;

    public ArgumentExpressionsListVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public List<Argument> visitUnnamedArgumentsList(@NotNull CylvreParser.UnnamedArgumentsListContext ctx) {
        ArgumentExpressionVisitor argumentExpressionVisitor = new ArgumentExpressionVisitor(expressionVisitor);
        return ctx.argument().stream()
                .map(a -> a.accept(argumentExpressionVisitor)).collect(toList());
    }

    @Override
    public List<Argument> visitNamedArgumentsList(@NotNull CylvreParser.NamedArgumentsListContext ctx) {
        ArgumentExpressionVisitor argumentExpressionVisitor = new ArgumentExpressionVisitor(expressionVisitor);
        return ctx.namedArgument().stream()
                .map(a -> a.accept(argumentExpressionVisitor)).collect(toList());
    }
}
