package Cylvre.exception;

import Cylvre.domain.node.expression.Expression;

public class UnsupportedRangedLoopTypes extends RuntimeException {
    public UnsupportedRangedLoopTypes(Expression startExpression, Expression endExpression) {
        super("Only integer types are supported so far");
    }

}
