package Cylvre.exception;

import Cylvre.domain.scope.FunctionSignature;

public class MethodWithNameAlreadyDefinedException extends RuntimeException {
    public MethodWithNameAlreadyDefinedException(FunctionSignature signature) {
        super("Method already defined in scope :" + signature);
    }

}
