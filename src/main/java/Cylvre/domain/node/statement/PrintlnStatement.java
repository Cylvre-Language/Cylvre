package Cylvre.domain.node.statement;

import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.node.expression.Expression;
import org.jetbrains.annotations.Nullable;

public class PrintlnStatement implements Statement {

    private final Expression expression;

    public PrintlnStatement(@Nullable Expression expression) {
        this.expression = expression;
    }

    @Nullable public Expression getExpression() {
        return expression;
    }


    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
