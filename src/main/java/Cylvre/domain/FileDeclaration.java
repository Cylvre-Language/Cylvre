package Cylvre.domain;

import Cylvre.domain.node.statement.Statement;

import java.util.Collections;
import java.util.List;

public class FileDeclaration {
    private final List<Function> functions;
    private final List<Statement> statements;
    private final List<ClassDeclaration> classDeclarations;

    public FileDeclaration(List<Function> functions, List<Statement> statements, List<ClassDeclaration> classDeclarations){
        this.functions = functions;
        this.classDeclarations = classDeclarations;
        this.statements = statements;
    }

    public List<Function> getFunctions(){return Collections.unmodifiableList(functions);}

    public List<Statement> getStatements(){return Collections.unmodifiableList(statements);}

    public List<ClassDeclaration> getClassDeclarations(){return Collections.unmodifiableList(classDeclarations);}

}
