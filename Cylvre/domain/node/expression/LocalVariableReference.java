package Cylvre.domain.node.expression;

import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.scope.LocalVariable;
import Cylvre.domain.type.Type;

public class LocalVariableReference implements Reference {

    private final LocalVariable variable;

    public LocalVariableReference(LocalVariable variable) {
        this.variable = variable;
    }

    public String getName() {
        return variable.getName();
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    @Override
    public Type getType() {
        return variable.getType();
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }

}
