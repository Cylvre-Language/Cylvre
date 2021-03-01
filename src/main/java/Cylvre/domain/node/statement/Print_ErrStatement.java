package Cylvre.domain.node.statement;

import Cylvre.domain.node.expression.Expression;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;

public class Print_ErrStatement implements Statement{

    private final Expression expression;

    public Print_ErrStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }


    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
