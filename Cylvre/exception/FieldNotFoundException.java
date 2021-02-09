package Cylvre.exception;

import Cylvre.domain.scope.CylvreScopes;

public class FieldNotFoundException extends RuntimeException {
    public FieldNotFoundException(CylvreScopes scope, String fieldName) {
        super("No field found for name " + fieldName + " found in scope" + scope);
    }

}