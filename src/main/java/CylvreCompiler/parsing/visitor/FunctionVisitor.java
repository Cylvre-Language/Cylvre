package CylvreCompiler.parsing.visitor;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.domain.Constructor;
import Cylvre.domain.Function;
import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.scope.FunctionSignature;
import Cylvre.domain.scope.LocalVariable;
import CylvreCompiler.parsing.visitor.statement.StatementVisitor;
import org.jetbrains.annotations.NotNull;

public class FunctionVisitor extends CylvreBaseVisitor<Function> {

    private final CylvreScopes scope;

    public FunctionVisitor(CylvreScopes scope) {
        this.scope = new CylvreScopes(scope);
    }

    @Override
    public Function visitFunction(@NotNull CylvreParser.FunctionContext ctx) {
        FunctionSignature signature = ctx.functionDeclaration().accept(new FunctionSignatureVisitor(scope));
        scope.addLocalVariable(new LocalVariable("this",scope.getClassType()));
        addParametersAsLocalVariables(signature);
        Statement block = getBlock(ctx);
        if(signature.getName().equals(scope.getClassName())) {
            return new Constructor(signature,block);
        }
        return new Function(signature, block);
    }

    private void addParametersAsLocalVariables(FunctionSignature signature) {
        signature.getParameters()
                 .forEach(param -> scope.addLocalVariable(new LocalVariable(param.getName(), param.getType())));
    }

    private Statement getBlock(CylvreParser.FunctionContext functionContext) {
        StatementVisitor statementVisitor = new StatementVisitor(scope);
        CylvreParser.BlockContext block = functionContext.block();
        return block.accept(statementVisitor);
    }
}
