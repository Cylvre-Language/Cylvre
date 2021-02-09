package Cylvre.exception;

import Cylvre.domain.node.expression.Argument;
import Cylvre.domain.scope.CylvreScopes;

import java.util.List;

public class MethodSignatureNotFoundException extends RuntimeException {
    public MethodSignatureNotFoundException(CylvreScopes scope, String methodName, List<Argument> parameterTypes) {
        super("There is no method '" + methodName + "' with parameters " + parameterTypes);
    }

}
