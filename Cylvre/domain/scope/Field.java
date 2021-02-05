package Cylvre.domain.scope;

import CylvreCompiler.bytecodegeneration.FieldGenerator;
import Cylvre.domain.type.Type;

public class Field implements Variable {

    private final String name;
    private final Type owner;
    private final Type type;

    public Field(String name, Type owner, Type type) {
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getOwnerInternalName() {
        return owner.getInternalName();
    }

    public void accept(FieldGenerator generator) {
        generator.generate(this);
    }
}
