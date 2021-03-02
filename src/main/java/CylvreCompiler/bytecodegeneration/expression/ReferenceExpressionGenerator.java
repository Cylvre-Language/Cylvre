package CylvreCompiler.bytecodegeneration.expression;

import Cylvre.domain.node.expression.FieldReference;
import Cylvre.domain.node.expression.LocalVariableReference;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.type.Type;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class ReferenceExpressionGenerator {
    private final MethodVisitor methodVisitor;
    private final CylvreScopes scope;

    public ReferenceExpressionGenerator(MethodVisitor methodVisitor, CylvreScopes scope) {
        this.methodVisitor = methodVisitor;
        this.scope = scope;
    }

    public void generate(LocalVariableReference localVariableReference) {
        String varName = localVariableReference.getName();
        int index = scope.getLocalVariableIndex(varName);
        Type type = localVariableReference.getType();
        methodVisitor.visitVarInsn(type.getLoadVariableOpcode(), index);
    }

    public void generate(FieldReference fieldReference) {
        String varName = fieldReference.getName();
        Type type = fieldReference.getType();
        String ownerInternalName = fieldReference.getOwnerInternalName();
        String descriptor = type.getDescriptor();
        methodVisitor.visitVarInsn(Opcodes.ALOAD,0);
        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, ownerInternalName,varName,descriptor);
    }
}