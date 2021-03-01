package CylvreCompiler.parsing.visitor.statement;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.statement.VariableDeclaration;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.scope.LocalVariable;
import Cylvre.domain.type.Type;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;

public class VariableDeclarationStatementVisitor extends CylvreBaseVisitor<VariableDeclaration> {
    private final ExpressionVisitor expressionVisitor;
    private final CylvreScopes scope;

    public VariableDeclarationStatementVisitor(ExpressionVisitor expressionVisitor, CylvreScopes scope) {
        this.expressionVisitor = expressionVisitor;
        this.scope = scope;
    }

    @Override
    public VariableDeclaration visitVariableDeclarationWithAssignment(@org.jetbrains.annotations.NotNull CylvreParser.VariableDeclarationWithAssignmentContext ctx) {
        String varName = ctx.name().getText();
        CylvreParser.ExpressionContext expressionCtx = ctx.expression();
        Expression expression = expressionCtx.accept(expressionVisitor);
        scope.addLocalVariable(new LocalVariable(varName, expression.getType()));
        return new VariableDeclaration(varName, expression);
    }

    @Override
    public VariableDeclaration visitVariableDeclarationWithoutAssignment(@org.jetbrains.annotations.NotNull CylvreParser.VariableDeclarationWithoutAssignmentContext ctx){
        String varName = ctx.name().getText();
        Type type = (Type) ctx.type();
        scope.addLocalVariable(new LocalVariable(varName, type));
        return new VariableDeclaration(varName);
    }

    /* TODO implement arrays fully and fix cast warning. Need help tho...
    @Override
    public VariableDeclaration visitVariableArrayDeclaration(@NotNull CylvreParser.VariableArrayDeclarationContext ctx){
        String varName = ctx.arrayDeclaration().name().getText();
        Type type = (Type) ctx.arrayDeclaration().arrayType();
        List<Expression> expressions = (List<Expression>) ctx.arrayDeclaration().arrayAssignment();
        scope.addLocalVariable(new LocalVariable(varName, type));
        return new ArrayDeclaration(varName, expressions, type);
    }
     */
}