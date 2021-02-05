package Cylvre.domain.node.expression;

import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.type.BuiltInType;
import Cylvre.domain.type.Type;

import java.util.Collections;
import java.util.List;

public class SuperCall implements Call {
    public static final String SUPER_IDENTIFIER = "super";
    private final List<Argument> arguments;

    public SuperCall() {
        this(Collections.emptyList());
    }

    public SuperCall(List<Argument> arguments) {
        this.arguments = arguments;
    }

    @Override
    public List<Argument> getArguments() {
        return Collections.unmodifiableList(arguments);
    }

    @Override
    public String getIdentifier() {
        return SUPER_IDENTIFIER;
    }

    @Override
    public Type getType() {
        return BuiltInType.VOID;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
