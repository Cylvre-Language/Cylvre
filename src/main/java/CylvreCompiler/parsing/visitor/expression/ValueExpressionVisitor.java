package CylvreCompiler.parsing.visitor.expression;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.util.TypeResolver;
import Cylvre.domain.node.expression.Value;
import Cylvre.domain.type.Type;
import org.jetbrains.annotations.NotNull;

public class ValueExpressionVisitor extends CylvreBaseVisitor<Value> {

    @Override
    public Value visitValue(@NotNull CylvreParser.ValueContext ctx) {
        String value = ctx.getText();
        Type type = TypeResolver.getFromValue(ctx);
        return new Value(type, value);
    }
}