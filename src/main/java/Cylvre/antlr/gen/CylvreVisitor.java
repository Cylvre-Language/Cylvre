package Cylvre.antlr.gen;// Generated from C:/Users/user/IdeaProjects/Cylvre/src\Cylvre.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CylvreParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CylvreVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CylvreParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CylvreParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#fileDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDeclaration(CylvreParser.FileDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#fileBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileBody(CylvreParser.FileBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(CylvreParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(CylvreParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(CylvreParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(CylvreParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CylvreParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(CylvreParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(CylvreParser.ParametersListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(CylvreParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CylvreParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterWithDefaultValue(CylvreParser.ParameterWithDefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CylvreParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CylvreParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(CylvreParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(CylvreParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CylvreParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CylvreParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationWithAssignment}
	 * labeled alternative in {@link CylvreParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationWithAssignment(CylvreParser.VariableDeclarationWithAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationWithoutAssignment}
	 * labeled alternative in {@link CylvreParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationWithoutAssignment(CylvreParser.VariableDeclarationWithoutAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableArrayDeclaration}
	 * labeled alternative in {@link CylvreParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableArrayDeclaration(CylvreParser.VariableArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(CylvreParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(CylvreParser.ArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CylvreParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#printlnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnStatement(CylvreParser.PrintlnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(CylvreParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#print_errStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_errStatement(CylvreParser.Print_errStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#scannerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScannerStatement(CylvreParser.ScannerStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link CylvreParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnWithValue(CylvreParser.ReturnWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link CylvreParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoid(CylvreParser.ReturnVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CylvreParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(CylvreParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#forConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditions(CylvreParser.ForConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(CylvreParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedArgumentsList}
	 * labeled alternative in {@link CylvreParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedArgumentsList(CylvreParser.UnnamedArgumentsListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedArgumentsList}
	 * labeled alternative in {@link CylvreParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgumentsList(CylvreParser.NamedArgumentsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(CylvreParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(CylvreParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(CylvreParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(CylvreParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(CylvreParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(CylvreParser.VarReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(CylvreParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CylvreParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(CylvreParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuperCall}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperCall(CylvreParser.SuperCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CylvreParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorCall}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(CylvreParser.ConstructorCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(CylvreParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CylvreParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CylvreParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(CylvreParser.QualifiedNameContext ctx);
}