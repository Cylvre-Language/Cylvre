package Cylvre.domain.node.statement;

import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.node.expression.Expression;

public class PrintStatement implements Statement {

    private final Expression expression;

    public PrintStatement(Expression expression) {
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
