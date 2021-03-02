package Cylvre.domain;

import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.scope.Field;

import java.util.Collections;
import java.util.List;

public class FileDeclaration {
    private final List<Function> functions;
    private final List<Statement> statements;
    private final List<ClassDeclaration> classDeclarations;
    private final List<Field> fields;

    public FileDeclaration(List<Function> functions, List<Statement> statements, List<ClassDeclaration> classDeclarations, List<Field> fields){
        this.functions = functions;
        this.classDeclarations = classDeclarations;
        this.statements = statements;
        this.fields = fields;
    }

    public List<Function> getFunctions(){return Collections.unmodifiableList(functions);}

    public List<Statement> getStatements(){return Collections.unmodifiableList(statements);}

    public List<ClassDeclaration> getClassDeclarations(){return Collections.unmodifiableList(classDeclarations);}

    public List<Field> getFields(){return Collections.unmodifiableList(fields);}

}
