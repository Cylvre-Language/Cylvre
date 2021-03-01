package CylvreCompiler.parsing.visitor;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.domain.ClassDeclaration;
import Cylvre.domain.FileDeclaration;
import Cylvre.domain.Function;
import Cylvre.domain.MetaData;
import Cylvre.domain.node.expression.ConstructorCall;
import Cylvre.domain.node.expression.FunctionCall;
import Cylvre.domain.node.expression.Parameter;
import Cylvre.domain.node.statement.Block;
import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.scope.FunctionSignature;
import Cylvre.domain.type.BuiltInType;
import CylvreCompiler.parsing.visitor.statement.StatementVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FileVisitor extends CylvreBaseVisitor<FileDeclaration> {
    private CylvreScopes scope;
    private String filename;


    @Override
    public FileDeclaration visitFileDeclaration(@NotNull CylvreParser.FileDeclarationContext ctx){
        MetaData metaData = new MetaData(filename, "java/lang/Object");
        scope = new CylvreScopes(metaData);
        StatementVisitor statementVisitor = new StatementVisitor(scope);
        FunctionSignatureVisitor functionSignatureVisitor = new FunctionSignatureVisitor(scope);
        ClassVisitor classVisitor = new ClassVisitor();
        List<CylvreParser.FunctionContext> functionContexts = ctx.fileBody().function();
        List<Statement> statements = ctx.fileBody().statement()
                .stream()
                .map(s -> s.accept(statementVisitor))
                .peek(scope::addStatement)
                .collect(Collectors.toList());

        functionContexts.stream().map(f -> f.functionDeclaration()
                .accept(functionSignatureVisitor))
                .forEach(scope::addSignature);

        List<Function> functions = functionContexts.stream()
                .map(functionContext -> functionContext.accept(new FunctionVisitor(scope)))
                .collect(Collectors.toList());

        List<ClassDeclaration> classDeclarations = ctx.fileBody().classDeclaration()
                .stream()
                .map(cd -> cd.accept(classVisitor))
                .collect(Collectors.toList());

        boolean startMethodDefined = scope.isParameterLessSignatureExists("src");
        if(startMethodDefined) {
            functions.add(GeneratedMainMethod());
        }

        return new FileDeclaration(functions, statements, classDeclarations);
    }

    private Function GeneratedMainMethod() {
        Parameter args = new Parameter("args", BuiltInType.STRING_ARR, Optional.empty());
        FunctionSignature functionSignature = new FunctionSignature("main", Collections.singletonList(args), BuiltInType.VOID);
        ConstructorCall constructorCall = new ConstructorCall(scope.getClassName());
        FunctionSignature startFunSignature = new FunctionSignature("src", Collections.emptyList(), BuiltInType.VOID);
        FunctionCall startFunctionCall = new FunctionCall(startFunSignature, Collections.emptyList(), scope.getClassType());
        Block block = new Block(new CylvreScopes(scope), Arrays.asList(constructorCall,startFunctionCall));
        return new Function(functionSignature, block);
    }

    public void initializeFileVisitor(String fileName){
        this.filename = fileName;
    }
}
