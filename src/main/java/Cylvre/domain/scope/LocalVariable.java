package Cylvre.domain.scope;

import Cylvre.domain.type.Type;

public class LocalVariable implements Variable {
    private final String name;
    private final Type type;

    public LocalVariable(String name, Type type) {
        this.type = type;
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
