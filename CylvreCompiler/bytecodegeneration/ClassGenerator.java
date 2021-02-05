package CylvreCompiler.bytecodegeneration;

import Cylvre.domain.Function;
import Cylvre.domain.ClassDeclaration;
import Cylvre.domain.scope.Field;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.util.List;

public class ClassGenerator {

    private static final int CLASS_VERSION = 52;
    private final ClassWriter classWriter;

    public ClassGenerator(ClassWriter classWriter) {
        this.classWriter = classWriter;
    }

    public ClassWriter generate(ClassDeclaration classDeclaration) {
        String name = classDeclaration.getName();
        classWriter.visit(CLASS_VERSION, Opcodes.ACC_SUPER, name,null,"java/lang/Object",null);
        List<Function> methods = classDeclaration.getMethods();
        List<Field> fields = classDeclaration.getFields();
        FieldGenerator fieldGenerator = new FieldGenerator(classWriter);
        fields.forEach(f -> f.accept(fieldGenerator));
        MethodGenerator methodGenerator = new MethodGenerator(classWriter);
        methods.forEach(f ->f.accept(methodGenerator));
        classWriter.visitEnd();
        return classWriter;
    }


}
