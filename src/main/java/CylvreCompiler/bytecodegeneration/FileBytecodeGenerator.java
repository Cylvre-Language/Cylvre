package CylvreCompiler.bytecodegeneration;

import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.ClassDeclaration;
import Cylvre.domain.FileDeclaration;
import Cylvre.domain.Function;
import Cylvre.domain.MetaData;
import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.scope.CylvreScopes;
import org.apache.commons.lang3.StringUtils;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.util.List;

public class FileBytecodeGenerator {
    private final ClassWriter classWriter;

    public FileBytecodeGenerator() {
        classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS);
    }

    public ClassWriter generate(String fileName, FileDeclaration fileDeclaration){
        String classfileName = StringUtils.remove(fileName, ".cylv");
        MetaData metaData = new MetaData(classfileName, "java/lang/Object");
        CylvreScopes scope = new CylvreScopes(metaData);
        classWriter.visit(52, Opcodes.ACC_PUBLIC, classfileName, null, "java/lang/Object", null);
        List<Function> functions = fileDeclaration.getFunctions();
        List<ClassDeclaration> classDeclarations = fileDeclaration.getClassDeclarations();
        List<Statement> statements = fileDeclaration.getStatements();
        MethodGenerator methodGenerator = new MethodGenerator(classWriter);
        functions.forEach(f -> f.accept(methodGenerator));
        StatementGenerator statementGenerator = new StatementGenerator(null,scope);
        statements.forEach(s -> s.accept(statementGenerator));
        ClassGenerator classGenerator = new ClassGenerator(classWriter);
        classDeclarations.forEach(cd -> cd.accept(classGenerator));
        classWriter.visitEnd();
        return classWriter;
    }
}