package CylvreCompiler.parsing.visitor.expression.function;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.util.TypeResolver;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.expression.Parameter;
import Cylvre.domain.type.Type;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Optional;

public class ParameterExpressionVisitor extends CylvreBaseVisitor<Parameter> {

    private final ExpressionVisitor expressionVisitor;

    public ParameterExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public Parameter visitParameter(@NotNull CylvreParser.ParameterContext ctx) {
        String name = ctx.ID().getText();
        Type type = TypeResolver.getFromTypeContext(ctx.type());
        return new Parameter(name, type, Optional.empty());
    }

    @Override
    public Parameter visitParameterWithDefaultValue(@NotNull CylvreParser.ParameterWithDefaultValueContext ctx) {
        String name = ctx.ID().getText();
        Type type = TypeResolver.getFromTypeContext(ctx.type());
        Expression defaultValue = ctx.defaultValue.accept(expressionVisitor);
        return new Parameter(name, type, Optional.of(defaultValue));
    }
}
