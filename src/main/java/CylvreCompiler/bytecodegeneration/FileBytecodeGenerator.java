package CylvreCompiler.bytecodegeneration;

import Cylvre.domain.ClassDeclaration;
import Cylvre.domain.FileDeclaration;
import Cylvre.domain.Function;
import Cylvre.domain.MetaData;
import Cylvre.domain.node.statement.Statement;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.scope.Field;
import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import org.apache.commons.lang3.StringUtils;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.List;

public class FileBytecodeGenerator {
    private MethodVisitor methodVisitor1;
    private final ClassWriter classWriter;

    public FileBytecodeGenerator() {
        classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS);
    }

    public ClassWriter generate(String fileName, FileDeclaration fileDeclaration){
        MethodVisitor methodVisitor = methodVisitor1;
        String classfileName = StringUtils.remove(fileName, ".cyl");
        MetaData metaData = new MetaData(classfileName, "java/lang/Object");
        CylvreScopes scope = new CylvreScopes(metaData);
        classWriter.visit(52, Opcodes.ACC_PUBLIC, classfileName, null, "java/lang/Object", null);

        List<Function> functions = fileDeclaration.getFunctions();
        List<ClassDeclaration> classDeclarations = fileDeclaration.getClassDeclarations();
        List<Statement> statements = fileDeclaration.getStatements();
        List<Field> fields = fileDeclaration.getFields();

        FieldGenerator fieldGenerator = new FieldGenerator(classWriter);
        fields.forEach(field -> field.accept(fieldGenerator));

        MethodGenerator methodGenerator = new MethodGenerator(classWriter);
        functions.forEach(f -> f.accept(methodGenerator));

        StatementGenerator statementGenerator = new StatementGenerator(null, scope);
        statements.forEach(s -> s.accept(statementGenerator));

        ClassGenerator classGenerator = new ClassGenerator(classWriter);
        classDeclarations.forEach(cd -> cd.accept(classGenerator));

        classWriter.visitEnd();
        return classWriter;
    }

    public void initializeMethodVisitor(MethodVisitor methodVisitor){
        FileBytecodeGenerator fileBytecodeGenerator = new FileBytecodeGenerator();
        fileBytecodeGenerator.methodVisitor1 = methodVisitor;
    }

}
