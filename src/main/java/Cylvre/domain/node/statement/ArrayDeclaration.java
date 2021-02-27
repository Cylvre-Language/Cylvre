package Cylvre.domain.node.statement;

import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.type.Type;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;

import java.util.List;

/*TODO experiment (and add a super() call to variable declaration and make variable declaration handle arrays.)*/

public class ArrayDeclaration extends VariableDeclaration implements Statement{

    public ArrayDeclaration(String name, List<Expression> expressionList, Type type){
        super(name, expressionList, type);
    }
    @Override
    public void accept(StatementGenerator generator){generator.generate(this);}
}
