package Cylvre.domain.node.expression;

import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;

public interface Reference extends Expression {
    String getName();

    @Override
    void accept(ExpressionGenerator generator);

    @Override
    void accept(StatementGenerator generator);
}
