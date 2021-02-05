package CylvreCompiler.parsing.visitor;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.util.TypeResolver;
import Cylvre.domain.node.expression.Parameter;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.scope.FunctionSignature;
import Cylvre.domain.type.Type;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;
import CylvreCompiler.parsing.visitor.expression.function.ParameterExpressionListVisitor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Collections;
import java.util.List;

public class FunctionSignatureVisitor extends CylvreBaseVisitor<FunctionSignature> {

    private final ExpressionVisitor expressionVisitor;

    public FunctionSignatureVisitor(CylvreScopes scope) {
        this.expressionVisitor = new ExpressionVisitor(scope);
    }

    @Override
    public FunctionSignature visitFunctionDeclaration(@NotNull CylvreParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.functionName().getText();
        Type returnType = TypeResolver.getFromTypeContext(ctx.type());
        CylvreParser.ParametersListContext parametersCtx = ctx.parametersList();
        if(parametersCtx != null) {
            List<Parameter> parameters = parametersCtx.accept(new ParameterExpressionListVisitor(expressionVisitor));
            return new FunctionSignature(functionName, parameters, returnType);
        }
        return new FunctionSignature(functionName, Collections.emptyList(), returnType);

    }
}
