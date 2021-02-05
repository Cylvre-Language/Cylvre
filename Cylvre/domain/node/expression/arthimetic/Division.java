package Cylvre.domain.node.expression.arthimetic;

import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.node.expression.Expression;

public class Division extends ArithmeticExpression {
    public Division(Expression leftExpress, Expression rightExpress) {
        super(leftExpress,rightExpress);
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
