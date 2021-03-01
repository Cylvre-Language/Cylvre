package CylvreCompiler.parsing.visitor;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.util.TypeResolver;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.scope.Field;
import Cylvre.domain.type.Type;
import org.jetbrains.annotations.NotNull;

public class FieldVisitor extends CylvreBaseVisitor<Field> {

    private final CylvreScopes scope;

    public FieldVisitor(CylvreScopes scope) {
        this.scope = scope;
    }

    @Override
    public Field visitField(@NotNull CylvreParser.FieldContext ctx) {
        Type owner = scope.getClassType();
        Type type = TypeResolver.getFromTypeContext(ctx.type());
        String name = ctx.name().getText();
        return new Field(name, owner, type);
    }
}
