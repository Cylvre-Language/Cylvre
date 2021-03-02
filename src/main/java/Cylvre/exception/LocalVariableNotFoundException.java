package Cylvre.exception;

import Cylvre.domain.scope.CylvreScopes;

public class LocalVariableNotFoundException extends RuntimeException {
    public LocalVariableNotFoundException(CylvreScopes scope, String variableName) {
        super("No local variable found for name " + variableName + " found in scope" + scope);
    }

}
