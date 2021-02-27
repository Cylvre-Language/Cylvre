package Cylvre.exception;

public class FunctionNameEqualClassException extends RuntimeException {
    public FunctionNameEqualClassException(String functionName) {
        super("Function name cannot be same as the class : " + functionName);
    }
}
