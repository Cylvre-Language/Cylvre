package CylvreCompiler.parsing.visitor.expression;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.domain.node.expression.FieldReference;
import Cylvre.domain.node.expression.LocalVariableReference;
import Cylvre.domain.node.expression.Reference;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.scope.Field;
import Cylvre.domain.scope.LocalVariable;
import org.jetbrains.annotations.NotNull;

public class VariableReferenceExpressionVisitor extends CylvreBaseVisitor<Reference> {
    private final CylvreScopes scope;

    public VariableReferenceExpressionVisitor(CylvreScopes scope) {
        this.scope = scope;
    }

    @Override
    public Reference visitVarReference(@NotNull CylvreParser.VarReferenceContext ctx) {
        String varName = ctx.getText();
        if(scope.isFieldExists(varName)) {
            Field field = scope.getField(varName);
            return new FieldReference(field);
        }
        LocalVariable variable = scope.getLocalVariable(varName);
        return new LocalVariableReference(variable);
    }
}