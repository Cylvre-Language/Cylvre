package CylvreCompiler.parsing.visitor.statement;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.domain.node.statement.Block;
import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.scope.CylvreScopes;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class BlockStatementVisitor extends CylvreBaseVisitor<Block> {
    private final CylvreScopes scope;

    public BlockStatementVisitor(CylvreScopes scope) {
        this.scope = scope;
    }

    @Override
    public Block visitBlock(@NotNull CylvreParser.BlockContext ctx) {
        List<CylvreParser.StatementContext> blockstatementsCtx = ctx.statement();
        CylvreScopes newScope = new CylvreScopes(scope);
        StatementVisitor statementVisitor = new StatementVisitor(newScope);
        List<Statement> statements = blockstatementsCtx.stream().map(smtt -> smtt.accept(statementVisitor)).collect(Collectors.toList());
        return new Block(newScope, statements);
    }
}