package CylvreCompiler.bytecodegeneration.statement;

import CylvreCompiler.bytecodegeneration.FileBytecodeGenerator;
import CylvreCompiler.bytecodegeneration.expression.ExpressionGenerator;
import Cylvre.domain.node.expression.*;
import Cylvre.domain.node.expression.arithmetic.Addition;
import Cylvre.domain.node.expression.arithmetic.Division;
import Cylvre.domain.node.expression.arithmetic.Multiplication;
import Cylvre.domain.node.expression.arithmetic.Subtraction;
import Cylvre.domain.node.statement.*;
import Cylvre.domain.scope.CylvreScopes;
import org.objectweb.asm.MethodVisitor;

public class StatementGenerator {
    private final FileBytecodeGenerator fileBytecodeGenerator;
    private final PrintlnStatementGenerator printLnStatementGenerator;
    private final VariableDeclarationStatementGenerator variableDeclarationStatementGenerator;
    private final ReturnStatementGenerator returnStatementGenerator;
    private final IfStatementGenerator ifStatementGenerator;
    private final BlockStatementGenerator blockStatementGenerator;
    private final ForStatementGenerator forStatementGenerator;
    private final AssignmentStatementGenerator assignmentStatementGenerator;
    private final ArrayDeclarationStatementGenerator arrayDeclarationStatementGenerator;
    private final ExpressionGenerator expressionGenerator;
    private final PrintStatementGenerator printStatementGenerator;
    private final Print_ErrStatementGenerator print_errStatementGenerator;
    private final ScannerStatementGenerator scannerStatementGenerator;

    public StatementGenerator(MethodVisitor methodVisitor, CylvreScopes scope) {
        fileBytecodeGenerator = new FileBytecodeGenerator();
        fileBytecodeGenerator.initializeMethodVisitor(methodVisitor);

        expressionGenerator = new ExpressionGenerator(methodVisitor, scope);
        print_errStatementGenerator = new Print_ErrStatementGenerator(expressionGenerator, methodVisitor);
        printLnStatementGenerator = new PrintlnStatementGenerator(expressionGenerator,methodVisitor);
        variableDeclarationStatementGenerator = new VariableDeclarationStatementGenerator(this, expressionGenerator);
        forStatementGenerator = new ForStatementGenerator(methodVisitor);
        blockStatementGenerator = new BlockStatementGenerator(methodVisitor);
        ifStatementGenerator = new IfStatementGenerator(this, expressionGenerator, methodVisitor);
        returnStatementGenerator = new ReturnStatementGenerator(expressionGenerator, methodVisitor);
        assignmentStatementGenerator = new AssignmentStatementGenerator(methodVisitor, expressionGenerator,scope);
        arrayDeclarationStatementGenerator = new ArrayDeclarationStatementGenerator(expressionGenerator, methodVisitor, scope);
        printStatementGenerator = new PrintStatementGenerator(expressionGenerator, methodVisitor);
        scannerStatementGenerator = new ScannerStatementGenerator(methodVisitor);
    }

    public void generate(PrintlnStatement printLnStatement) {
        printLnStatementGenerator.generate(printLnStatement);
    }

    public void generate(VariableDeclaration variableDeclaration) {
        variableDeclarationStatementGenerator.generate(variableDeclaration);
    }

    public void generate(FunctionCall functionCall) {
        functionCall.accept(expressionGenerator);
    }

    public void generate(ReturnStatement returnStatement) {
        returnStatementGenerator.generate(returnStatement);
    }

    public void generate(IfStatement ifStatement) {
        ifStatementGenerator.generate(ifStatement);
    }

    public void generate(Block block) {
        blockStatementGenerator.generate(block);
    }

    public void generate(RangedForStatement rangedForStatement) {
        forStatementGenerator.generate(rangedForStatement);
    }

    public void generate(Assignment assignment) {
        assignmentStatementGenerator.generate(assignment);
    }

    public void generate(SuperCall superCall) {
        expressionGenerator.generate(superCall);
    }

    public void generate(ConstructorCall constructorCall) {
        expressionGenerator.generate(constructorCall);
    }

    public void generate(Addition addition) {
        expressionGenerator.generate(addition);
    }

    public void generate(Parameter parameter) {
        expressionGenerator.generate(parameter);
    }

    public void generate(ConditionalExpression conditionalExpression) {
        expressionGenerator.generate(conditionalExpression);
    }

    public void generate(Multiplication multiplication) {
        expressionGenerator.generate(multiplication);
    }

    public void generate(Value value) {
        expressionGenerator.generate(value);
    }

    public void generate(Subtraction subtraction) {
        expressionGenerator.generate(subtraction);
    }

    public void generate(Division division) {
        expressionGenerator.generate(division);
    }

    public void generate(EmptyExpression emptyExpression) {
        expressionGenerator.generate(emptyExpression);
    }

    public void generate(LocalVariableReference localVariableReference) {
        expressionGenerator.generate(localVariableReference);
    }

    public void generate(FieldReference fieldReference) {
        expressionGenerator.generate(fieldReference);
    }

    public void generate(ArrayDeclaration arrayDeclaration){arrayDeclarationStatementGenerator.generate(arrayDeclaration);}

    public void generate(PrintStatement printStatement){printStatementGenerator.generate(printStatement);}

    public void generate(Print_ErrStatement print_errStatement){print_errStatementGenerator.generate(print_errStatement);}

    public void generate(ScannerStatement scannerStatement){scannerStatementGenerator.generate(scannerStatement);}
}
