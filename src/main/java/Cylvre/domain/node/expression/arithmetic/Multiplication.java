package Cylvre.domain.node.expression.arithmetic;

import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.node.expression.Expression;

public class Multiplication extends ArithmeticExpression {
    public Multiplication(Expression leftExpress, Expression rightExpress) {
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
