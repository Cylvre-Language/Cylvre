package Cylvre.exception;


import Cylvre.domain.node.expression.Expression;

public class ComparisonBetweenDifferentTypesException extends RuntimeException {
    public ComparisonBetweenDifferentTypesException(Expression leftExpression, Expression rightExpression) {
        super("Comparison between types " + leftExpression.getType() + " and " + rightExpression.getType() + " not yet supported");
    }
}
