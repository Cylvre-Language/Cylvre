package CylvreCompiler.parsing.visitor.expression.function;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.domain.node.expression.Argument;
import Cylvre.domain.node.expression.Expression;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class ArgumentExpressionVisitor extends CylvreBaseVisitor<Argument> {

    private final ExpressionVisitor expressionVisitor;

    public ArgumentExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public Argument visitArgument(@org.jetbrains.annotations.NotNull CylvreParser.ArgumentContext ctx) {
        Expression value = ctx.expression().accept(expressionVisitor);
        return new Argument(value, Optional.empty());
    }

    @Override
    public Argument visitNamedArgument(@NotNull CylvreParser.NamedArgumentContext ctx) {
        Expression value = ctx.expression().accept(expressionVisitor);
        String name = ctx.name().getText();
        return new Argument(value, Optional.of(name));
    }

}
