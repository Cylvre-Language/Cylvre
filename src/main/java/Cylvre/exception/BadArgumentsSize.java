package Cylvre.exception;


import gen.CylvreParser;
import Cylvre.domain.scope.FunctionSignature;

import java.util.List;

public class BadArgumentsSize extends RuntimeException {
    public BadArgumentsSize(FunctionSignature function, List<CylvreParser.ExpressionContext> calledParameters) {
        super("Bad arguments amount");
    }
}
