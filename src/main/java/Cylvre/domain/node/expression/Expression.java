package Cylvre.domain.node.expression;

import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.type.Type;

public interface Expression extends Statement {
    Type getType();
    void accept(ExpressionGenerator generator);

    @Override
    void accept(StatementGenerator generator);
}
