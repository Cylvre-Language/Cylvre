package Cylvre.domain;

import CylvreCompiler.bytecodegeneration.MethodGenerator;
import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.scope.FunctionSignature;
import Cylvre.domain.type.BuiltInType;
import Cylvre.domain.type.Type;

public class Constructor extends Function {
    public Constructor(FunctionSignature signature, Statement block) {
        super(signature, block);
    }

    @Override
    public Type getReturnType() {
        return BuiltInType.VOID;
    }

    @Override
    public void accept(MethodGenerator generator) {
        generator.generate(this);
    }
}
