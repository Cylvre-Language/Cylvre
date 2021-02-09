package Cylvre.exception;


import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.expression.arthimetic.ArithmeticExpression;

public class UnsupportedArithmeticOperationException extends RuntimeException {
    public UnsupportedArithmeticOperationException(ArithmeticExpression expression) {
        super(prepareMessage(expression));
    }

    private static String prepareMessage(ArithmeticExpression expression) {
        Expression leftExpression = expression.getLeftExpression();
        Expression rightExpression = expression.getRightExpression();
        return "Unsupported arithmetic operation between " + leftExpression +" and "+rightExpression;
    }
}
