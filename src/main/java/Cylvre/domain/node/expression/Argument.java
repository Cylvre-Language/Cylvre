package Cylvre.domain.node.expression;

import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.type.Type;

import java.util.Optional;

public class Argument implements Expression {

    private final Optional<String> parameterName;
    private final Expression expression;

    public Argument(Expression expression, Optional<String> parameterName) {
        this.parameterName = parameterName;
        this.expression = expression;
    }

    @Override
    public Type getType() {
        return expression.getType();
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        expression.accept(generator);
    }

    @Override
    public void accept(StatementGenerator generator) {
        expression.accept(generator);
    }

    public Optional<String> getParameterName() {
        return parameterName;
    }
}
