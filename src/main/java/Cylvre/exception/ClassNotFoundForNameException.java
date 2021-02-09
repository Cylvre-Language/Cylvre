package Cylvre.exception;

public class ClassNotFoundForNameException extends RuntimeException {
    public ClassNotFoundForNameException(String className) {
        super("class not found " + className);
    }
}
