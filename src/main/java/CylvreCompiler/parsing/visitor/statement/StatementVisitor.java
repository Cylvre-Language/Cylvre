package CylvreCompiler.parsing.visitor.statement;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.domain.node.expression.ConditionalExpression;
import Cylvre.domain.node.expression.Expression;
import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.scope.CylvreScopes;
import CylvreCompiler.parsing.visitor.expression.ExpressionVisitor;
import org.jetbrains.annotations.NotNull;


public class StatementVisitor extends CylvreBaseVisitor<Statement> {

    private final ExpressionVisitor expressionVisitor;
    private final PrintlnStatementVisitor printLnStatementVisitor;
    private final VariableDeclarationStatementVisitor variableDeclarationStatementVisitor;
    private final ReturnStatementVisitor returnStatementVisitor;
    private final BlockStatementVisitor blockStatementVisitor;
    private final IfStatementVisitor ifStatementVisitor;
    private final ForStatementVisitor forStatementVisitor;
    private final AssignmentStatementVisitor assignmentStatementVisitor;
    private final PrintStatementVisitor printStatementVisitor;
    private final Print_ErrStatementVisitor print_errStatementVisitor;
    private final ScannerStatementVisitor scannerStatementVisitor;

    public StatementVisitor(CylvreScopes scope) {
        expressionVisitor = new ExpressionVisitor(scope);
        printLnStatementVisitor = new PrintlnStatementVisitor(expressionVisitor);
        print_errStatementVisitor = new Print_ErrStatementVisitor(expressionVisitor);
        variableDeclarationStatementVisitor = new VariableDeclarationStatementVisitor(expressionVisitor,scope);
        returnStatementVisitor = new ReturnStatementVisitor(expressionVisitor);
        blockStatementVisitor = new BlockStatementVisitor(scope);
        ifStatementVisitor = new IfStatementVisitor(this,expressionVisitor);
        forStatementVisitor = new ForStatementVisitor(scope);
        assignmentStatementVisitor = new AssignmentStatementVisitor(expressionVisitor);
        printStatementVisitor = new PrintStatementVisitor(expressionVisitor);
        scannerStatementVisitor = new ScannerStatementVisitor();
    }

    @Override
    public Statement visitPrintlnStatement(@NotNull CylvreParser.PrintlnStatementContext ctx) {
        return printLnStatementVisitor.visitPrintlnStatement(ctx);
    }

    @Override
    public Statement visitVariableDeclarationWithAssignment(@NotNull CylvreParser.VariableDeclarationWithAssignmentContext ctx) {
        return variableDeclarationStatementVisitor.visitVariableDeclarationWithAssignment(ctx);
    }

    @Override
    public Statement visitReturnVoid(@NotNull CylvreParser.ReturnVoidContext ctx) {
        return returnStatementVisitor.visitReturnVoid(ctx);
    }

    @Override
    public Statement visitReturnWithValue(@NotNull CylvreParser.ReturnWithValueContext ctx) {
        return returnStatementVisitor.visitReturnWithValue(ctx);
    }

    @Override
    public Statement visitBlock(@NotNull CylvreParser.BlockContext ctx) {
        return blockStatementVisitor.visitBlock(ctx);
    }

    @Override
    public Statement visitIfStatement(@NotNull CylvreParser.IfStatementContext ctx) {
        return ifStatementVisitor.visitIfStatement(ctx);
    }

    @Override
    public Expression visitVarReference(@NotNull CylvreParser.VarReferenceContext ctx) {
        return expressionVisitor.visitVarReference(ctx);
    }

    @Override
    public Expression visitValue(@NotNull CylvreParser.ValueContext ctx) {
        return expressionVisitor.visitValue(ctx);
    }

    @Override
    public Expression visitFunctionCall(@NotNull CylvreParser.FunctionCallContext ctx) {
        return expressionVisitor.visitFunctionCall(ctx);
    }

    @Override
    public Expression visitConstructorCall(@NotNull CylvreParser.ConstructorCallContext ctx) {
        return expressionVisitor.visitConstructorCall(ctx);
    }

    @Override
    public Expression visitSuperCall(@NotNull CylvreParser.SuperCallContext ctx) {
        return expressionVisitor.visitSuperCall(ctx);
    }

    @Override
    public Expression visitAdd(@NotNull CylvreParser.AddContext ctx) {
        return expressionVisitor.visitAdd(ctx);
    }

    @Override
    public Expression visitMultiply(@NotNull CylvreParser.MultiplyContext ctx) {
        return expressionVisitor.visitMultiply(ctx);
    }

    @Override
    public Expression visitSubtract(@NotNull CylvreParser.SubtractContext ctx) {
        return expressionVisitor.visitSubtract(ctx);
    }

    @Override
    public Expression visitDivide(@NotNull CylvreParser.DivideContext ctx) {
        return expressionVisitor.visitDivide(ctx);
    }

    @Override
    public ConditionalExpression visitConditionalExpression(@NotNull CylvreParser.ConditionalExpressionContext ctx) {
        return expressionVisitor.visitConditionalExpression(ctx);
    }

    @Override
    public Statement visitForStatement(@NotNull CylvreParser.ForStatementContext ctx) {
        return forStatementVisitor.visitForStatement(ctx);
    }

    @Override
    public Statement visitAssignment(@NotNull CylvreParser.AssignmentContext ctx) {
        return assignmentStatementVisitor.visitAssignment(ctx);
    }

    @Override
    public Statement visitPrintStatement(@NotNull CylvreParser.PrintStatementContext ctx){
        return printStatementVisitor.visitPrintStatement(ctx);
    }

    @Override
    public Statement visitPrint_errStatement(@NotNull CylvreParser.Print_errStatementContext ctx){
        return print_errStatementVisitor.visitPrint_errStatement(ctx);
    }

    @Override
    public Statement visitScannerStatement(@NotNull CylvreParser.ScannerStatementContext ctx){
        return scannerStatementVisitor.visitScannerStatement(ctx);
    }

}
