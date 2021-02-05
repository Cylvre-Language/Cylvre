package Cylvre.domain.node.statement;

import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.scope.CylvreScopes;

import java.util.Collections;
import java.util.List;

public class Block implements Statement {
    private final List<Statement> statements;
    private final CylvreScopes scope;

    public Block(CylvreScopes scope, List<Statement> statements) {
        this.scope = scope;
        this.statements = statements;
    }

    public static Block empty(CylvreScopes scope) {
        return new Block(scope, Collections.emptyList());
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    public CylvreScopes getScope() {
        return scope;
    }

    public List<Statement> getStatements() {
        return Collections.unmodifiableList(statements);
    }
}
