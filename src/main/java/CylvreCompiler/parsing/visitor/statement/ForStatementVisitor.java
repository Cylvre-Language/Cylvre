package CylvreCompiler.parsing.visitor.statement;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.statement.Assignment;
import Cylvre.domain.node.statement.RangedForStatement;
import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.node.statement.VariableDeclaration;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.scope.LocalVariable;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;
import org.jetbrains.annotations.NotNull;

public class ForStatementVisitor extends CylvreBaseVisitor<RangedForStatement> {
    private final CylvreScopes scope;
    private final ExpressionVisitor expressionVisitor;

    public ForStatementVisitor(CylvreScopes scope) {
        this.scope = scope;
        expressionVisitor = new ExpressionVisitor(this.scope);
    }

    @Override
    public RangedForStatement visitForStatement(@NotNull CylvreParser.ForStatementContext ctx) {
        CylvreScopes newScope = new CylvreScopes(scope);
        CylvreParser.ForConditionsContext forExpressionContext = ctx.forConditions();
        Expression startExpression = forExpressionContext.startExpr.accept(expressionVisitor);
        Expression endExpression = forExpressionContext.endExpr.accept(expressionVisitor);
        CylvreParser.VariableReferenceContext iterator = forExpressionContext.iterator;
        StatementVisitor statementVisitor = new StatementVisitor(newScope);
        String varName = iterator.getText();
        if(newScope.isLocalVariableExists(varName)) {
            Statement iteratorVariable = new Assignment(varName, startExpression);
            Statement statement = ctx.statement().accept(statementVisitor);
            return new RangedForStatement(iteratorVariable, startExpression, endExpression,statement, varName, newScope);
        } else {
            newScope.addLocalVariable(new LocalVariable(varName,startExpression.getType()));
            Statement iteratorVariable = new VariableDeclaration(varName,startExpression);
            Statement statement = ctx.statement().accept(statementVisitor);
            return new RangedForStatement(iteratorVariable, startExpression, endExpression,statement, varName,newScope);
        }
    }

}
