package CylvreCompiler.bytecodegeneration.statement;

import Cylvre.domain.node.statement.ScannerStatement;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class ScannerStatementGenerator {
    private final MethodVisitor methodVisitor;
    private final ClassVisitor classVisitor = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS
    );

    public ScannerStatementGenerator(MethodVisitor methodVisitor){
        this.methodVisitor = methodVisitor;
    }

    public void generate(ScannerStatement scannerStatement){
        methodVisitor.visitTypeInsn(Opcodes.NEW, "java/util/Scanner");
        var descriptor = classVisitor.visitField(Opcodes.GETSTATIC, "in", "Ljava/lang/System", null, "java/io/InputStream");
        String constructorDescriptor = "(L" + descriptor + ")V";
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/util/Scanner", "<init>", constructorDescriptor);
    }
}
