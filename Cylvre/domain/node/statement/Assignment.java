package Cylvre.domain.node.statement;

import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.node.expression.Expression;

import java.util.Collections;
import java.util.List;

public class Assignment implements Statement{
    private final String varName;
    private Expression expression;
    private List<Expression> expressionList;

    public Assignment(String varName, Expression expression) {
        this.varName = varName;
        this.expression = expression;
    }

    public Assignment(VariableDeclaration declarationStatement) {
        this.varName = declarationStatement.getName();
        this.expression = declarationStatement.getExpression();
    }

    public Assignment(ArrayDeclaration arrayDeclaration){
        this.varName = arrayDeclaration.getName();
        this.expressionList = arrayDeclaration.getExpressions();
    }

    public String getVarName() {
        return varName;
    }

    public Expression getExpression() {
        return expression;
    }

    public List<Expression> getExpressionList(){return Collections.unmodifiableList(expressionList);}

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
