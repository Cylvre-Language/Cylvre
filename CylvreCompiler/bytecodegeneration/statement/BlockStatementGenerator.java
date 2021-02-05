package CylvreCompiler.bytecodegeneration.statement;


import Cylvre.domain.node.statement.Block;
import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.scope.CylvreScopes;
import org.objectweb.asm.MethodVisitor;

import java.util.List;

public class BlockStatementGenerator {
    private final MethodVisitor methodVisitor;

    public BlockStatementGenerator(MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
    }

    public void generate(Block block) {
        CylvreScopes newScope = block.getScope();
        List<Statement> statements = block.getStatements();
        StatementGenerator statementGenerator = new StatementGenerator(methodVisitor, newScope);
        statements.forEach(stmt -> stmt.accept(statementGenerator));
    }
}