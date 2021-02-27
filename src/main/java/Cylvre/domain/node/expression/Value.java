package Cylvre.domain.node.expression;

import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.type.Type;

public class Value implements Expression {

    private final String value;
    private final Type type;

    public Value(Type type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }

    @Override
    public Type getType() {
        return type;
    }
}
