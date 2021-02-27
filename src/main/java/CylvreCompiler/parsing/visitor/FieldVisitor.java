package CylvreCompiler.parsing.visitor;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
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
        Type type = TypeResolver.getFromTypeContext(new CylvreParser.VariableDeclarationWithAssignmentContext(ctx.variableDeclaration()).type());
        String name = new CylvreParser.VariableDeclarationWithAssignmentContext(ctx.variableDeclaration()).name().getText();
        return new Field(name, owner, type);
    }
}
