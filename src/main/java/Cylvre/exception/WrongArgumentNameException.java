package Cylvre.exception;

import Cylvre.domain.node.expression.Argument;
import Cylvre.domain.node.expression.Parameter;

import java.util.List;

public class WrongArgumentNameException extends RuntimeException {
    public WrongArgumentNameException(Argument argument, List<Parameter> parameters) {
        super("You are trying to call method with argument name" + argument.getParameterName().get() + " where parameters = " + parameters);
    }
}
