package Cylvre.domain.node.statement;


import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.type.Type;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;

import java.util.Collections;
import java.util.List;

public class VariableDeclaration implements Statement {
    private final String name;
    private Expression expression;
    private List<Expression> expressions;
    private Type type;

    public VariableDeclaration(String name, Expression expression) {
        this.expression = expression;
        this.name = name;
    }

    public VariableDeclaration(String name, List<Expression> expressions, Type type){
        this.name = name;
        this.expressions = expressions;
        this.type = type;
    }

    public VariableDeclaration(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }

    public List<Expression> getExpressions() {return Collections.unmodifiableList(expressions); }

    public Type getType() {return type;}

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
