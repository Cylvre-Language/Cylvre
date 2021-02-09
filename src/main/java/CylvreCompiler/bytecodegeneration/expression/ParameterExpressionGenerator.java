package CylvreCompiler.bytecodegeneration.expression;

import Cylvre.domain.node.expression.Parameter;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.type.Type;
import org.objectweb.asm.MethodVisitor;

public class ParameterExpressionGenerator {
    private final MethodVisitor methodVisitor;
    private final CylvreScopes scope;

    public ParameterExpressionGenerator(MethodVisitor methodVisitor, CylvreScopes scope) {
        this.methodVisitor = methodVisitor;
        this.scope = scope;
    }

    public void generate(Parameter parameter) {
        Type type = parameter.getType();
        int index = scope.getLocalVariableIndex(parameter.getName());
        methodVisitor.visitVarInsn(type.getLoadVariableOpcode(), index);
    }
}