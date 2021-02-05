package CylvreCompiler.parsing.visitor.expression.function;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.exception.FunctionNameEqualClassException;
import Cylvre.domain.node.expression.*;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.scope.FunctionSignature;
import Cylvre.domain.scope.LocalVariable;
import Cylvre.domain.type.ClassType;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CallExpressionVisitor extends CylvreBaseVisitor<Call> {
    private final ExpressionVisitor expressionVisitor;
    private final CylvreScopes scope;

    public CallExpressionVisitor(ExpressionVisitor expressionVisitor, CylvreScopes scope) {
        this.expressionVisitor = expressionVisitor;
        this.scope = scope;
    }

    @Override
    public Call visitFunctionCall(@NotNull CylvreParser.FunctionCallContext ctx) {
        String functionName = ctx.functionName().getText();
        if (functionName.equals(scope.getClassName())) {
            throw new FunctionNameEqualClassException(functionName);
        }
        List<Argument> arguments = getArgumentsForCall(ctx.argumentList());
        boolean ownerIsExplicit = ctx.owner != null;
        if (ownerIsExplicit) {
            Expression owner = ctx.owner.accept(expressionVisitor);
            FunctionSignature signature = scope.getMethodCallSignature(Optional.of(owner.getType()),functionName, arguments);
            return new FunctionCall(signature, arguments, owner);
        }
        ClassType thisType = new ClassType(scope.getClassName());
        FunctionSignature signature = scope.getMethodCallSignature(functionName, arguments);
        LocalVariable thisVariable = new LocalVariable("this",thisType);
        return new FunctionCall(signature, arguments, new LocalVariableReference(thisVariable));
    }

    @Override
    public Call visitConstructorCall(@NotNull CylvreParser.ConstructorCallContext ctx) {
        String className = ctx.className().getText();
        List<Argument> arguments = getArgumentsForCall(ctx.argumentList());
        return new ConstructorCall(className, arguments);
    }

    @Override
    public Call visitSupercall(@NotNull CylvreParser.SupercallContext ctx) {
        List<Argument> arguments = getArgumentsForCall(ctx.argumentList());
        return new SuperCall(arguments);
    }

    private List<Argument> getArgumentsForCall(CylvreParser.ArgumentListContext argumentsListCtx) {
        if (argumentsListCtx != null) {
            ArgumentExpressionsListVisitor visitor = new ArgumentExpressionsListVisitor(expressionVisitor);
            return argumentsListCtx.accept(visitor);
        }
        return Collections.emptyList();
    }
}