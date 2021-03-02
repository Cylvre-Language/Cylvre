package Cylvre.domain.node.statement;

import Cylvre.domain.node.expression.Expression;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import org.jetbrains.annotations.Nullable;

public class Print_ErrStatement implements Statement{

    private final Expression expression;

    public Print_ErrStatement(@Nullable Expression expression) {
        this.expression = expression;
    }

    @Nullable
    public Expression getExpression() {
        return expression;
    }


    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
