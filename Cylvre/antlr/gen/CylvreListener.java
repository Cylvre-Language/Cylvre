package Cylvre.antlr.gen;// Generated from C:/Users/user/IdeaProjects/Cylvre/src\Cylvre.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CylvreParser}.
 */
public interface CylvreListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CylvreParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CylvreParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CylvreParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#fileDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFileDeclaration(CylvreParser.FileDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#fileDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFileDeclaration(CylvreParser.FileDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#fileBody}.
	 * @param ctx the parse tree
	 */
	void enterFileBody(CylvreParser.FileBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#fileBody}.
	 * @param ctx the parse tree
	 */
	void exitFileBody(CylvreParser.FileBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(CylvreParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(CylvreParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(CylvreParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(CylvreParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(CylvreParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(CylvreParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(CylvreParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(CylvreParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CylvreParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CylvreParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CylvreParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CylvreParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(CylvreParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(CylvreParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(CylvreParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(CylvreParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CylvreParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CylvreParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterParameterWithDefaultValue(CylvreParser.ParameterWithDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitParameterWithDefaultValue(CylvreParser.ParameterWithDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CylvreParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CylvreParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CylvreParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CylvreParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(CylvreParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(CylvreParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(CylvreParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(CylvreParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CylvreParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CylvreParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CylvreParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CylvreParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationWithAssignment}
	 * labeled alternative in {@link CylvreParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationWithAssignment(CylvreParser.VariableDeclarationWithAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationWithAssignment}
	 * labeled alternative in {@link CylvreParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationWithAssignment(CylvreParser.VariableDeclarationWithAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationWithoutAssignment}
	 * labeled alternative in {@link CylvreParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationWithoutAssignment(CylvreParser.VariableDeclarationWithoutAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationWithoutAssignment}
	 * labeled alternative in {@link CylvreParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationWithoutAssignment(CylvreParser.VariableDeclarationWithoutAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableArrayDeclaration}
	 * labeled alternative in {@link CylvreParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayDeclaration(CylvreParser.VariableArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableArrayDeclaration}
	 * labeled alternative in {@link CylvreParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayDeclaration(CylvreParser.VariableArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(CylvreParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(CylvreParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(CylvreParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(CylvreParser.ArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CylvreParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CylvreParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(CylvreParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(CylvreParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link CylvreParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnWithValue(CylvreParser.ReturnWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link CylvreParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnWithValue(CylvreParser.ReturnWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link CylvreParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnVoid(CylvreParser.ReturnVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link CylvreParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnVoid(CylvreParser.ReturnVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CylvreParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CylvreParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CylvreParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CylvreParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#forConditions}.
	 * @param ctx the parse tree
	 */
	void enterForConditions(CylvreParser.ForConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#forConditions}.
	 * @param ctx the parse tree
	 */
	void exitForConditions(CylvreParser.ForConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(CylvreParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(CylvreParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedArgumentsList}
	 * labeled alternative in {@link CylvreParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedArgumentsList(CylvreParser.UnnamedArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedArgumentsList}
	 * labeled alternative in {@link CylvreParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedArgumentsList(CylvreParser.UnnamedArgumentsListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedArgumentsList}
	 * labeled alternative in {@link CylvreParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgumentsList(CylvreParser.NamedArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedArgumentsList}
	 * labeled alternative in {@link CylvreParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgumentsList(CylvreParser.NamedArgumentsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CylvreParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CylvreParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(CylvreParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(CylvreParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CylvreParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CylvreParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(CylvreParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(CylvreParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivide(CylvreParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivide(CylvreParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(CylvreParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(CylvreParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(CylvreParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(CylvreParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CylvreParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CylvreParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Supercall}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSupercall(CylvreParser.SupercallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Supercall}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSupercall(CylvreParser.SupercallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(CylvreParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(CylvreParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CylvreParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CylvreParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorCall}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCall(CylvreParser.ConstructorCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorCall}
	 * labeled alternative in {@link CylvreParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCall(CylvreParser.ConstructorCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(CylvreParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(CylvreParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CylvreParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CylvreParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CylvreParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(CylvreParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CylvreParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(CylvreParser.QualifiedNameContext ctx);
}