package CylvreCompiler.parsing.visitor.expression.function;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.domain.node.expression.Parameter;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParameterExpressionListVisitor extends CylvreBaseVisitor<List<Parameter>> {

    private final ExpressionVisitor expressionVisitor;

    public ParameterExpressionListVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public List<Parameter> visitParametersList(@NotNull CylvreParser.ParametersListContext ctx) {
        List<CylvreParser.ParameterContext> paramsCtx = ctx.parameter();
        ParameterExpressionVisitor parameterExpressionVisitor = new ParameterExpressionVisitor(expressionVisitor);
        List<Parameter> parameters = new ArrayList<>();
        if(paramsCtx != null) {
            List<Parameter> params = paramsCtx.stream().map(p -> p.accept(parameterExpressionVisitor)).collect(Collectors.toList());
            parameters.addAll(params);
        }
        List<CylvreParser.ParameterWithDefaultValueContext> paramsWithDefaultValueCtx = ctx.parameterWithDefaultValue();
        if(paramsWithDefaultValueCtx != null) {
            List<Parameter> params = paramsWithDefaultValueCtx.stream().map(p -> p.accept(parameterExpressionVisitor)).collect(Collectors.toList());
            parameters.addAll(params);
        }
        return parameters;
    }

}

