package Cylvre.exception;

import Cylvre.domain.node.expression.FunctionCall;
import Cylvre.domain.scope.CylvreScopes;

public class CalledFunctionDoesNotExistException extends RuntimeException {
    private final FunctionCall functionCall;

    public CalledFunctionDoesNotExistException(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public CalledFunctionDoesNotExistException(FunctionCall functionCall, ReflectiveOperationException e) {
        this(functionCall);
    }

    public CalledFunctionDoesNotExistException(FunctionCall functionCall, CylvreScopes scope) {
        this(functionCall);
    }

    @Override
    public String getMessage() {
        return "Function call" + functionCall.toString() + "does not exists";
    }
}
