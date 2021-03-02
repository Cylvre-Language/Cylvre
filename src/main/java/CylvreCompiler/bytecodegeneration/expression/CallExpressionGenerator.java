package CylvreCompiler.bytecodegeneration.expression;

import Cylvre.exception.BadArgumentsToFunctionCallException;
import Cylvre.exception.WrongArgumentNameException;
import Cylvre.util.DescriptorFactory;
import Cylvre.domain.node.expression.*;
import Cylvre.domain.scope.CylvreScopes;
import Cylvre.domain.scope.FunctionSignature;
import Cylvre.domain.type.ClassType;
import com.google.common.collect.Ordering;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CallExpressionGenerator {
    private final ExpressionGenerator expressionGenerator;
    private final CylvreScopes scope;
    private final MethodVisitor methodVisitor;

    public CallExpressionGenerator(ExpressionGenerator expressionGenerator, CylvreScopes scope, MethodVisitor methodVisitor) {
        this.expressionGenerator = expressionGenerator;
        this.scope = scope;
        this.methodVisitor = methodVisitor;
    }

    public void generate(ConstructorCall constructorCall) {
        FunctionSignature signature = scope.getConstructorCallSignature(constructorCall.getIdentifier(), constructorCall.getArguments());
        String ownerDescriptor = new ClassType(signature.getName()).getDescriptor();
        methodVisitor.visitTypeInsn(Opcodes.NEW, ownerDescriptor);
        methodVisitor.visitInsn(Opcodes.DUP);
        String methodDescriptor = DescriptorFactory.getMethodDescriptor(signature);
        generateArguments(constructorCall,signature);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, ownerDescriptor, "<init>", methodDescriptor);
    }

    public void generate(SuperCall superCall) {
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
        generateArguments(superCall);
        String ownerDescriptor = scope.getSuperClassInternalName();
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, ownerDescriptor, "<init>", "()V" /*TODO Handle super calls with arguments*/);
    }

    public void generate(FunctionCall functionCall) {
        Expression owner = functionCall.getOwner();
        owner.accept(expressionGenerator);
        generateArguments(functionCall);
        String functionName = functionCall.getIdentifier();
        String methodDescriptor = DescriptorFactory.getMethodDescriptor(functionCall.getSignature());
        String ownerDescriptor = functionCall.getOwnerType().getInternalName();
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, ownerDescriptor, functionName, methodDescriptor);
    }

    private void generateArguments(FunctionCall call) {
        FunctionSignature signature = scope.getMethodCallSignature(Optional.of(call.getOwnerType()),call.getIdentifier(),call.getArguments());
        generateArguments(call,signature);
    }

    private void generateArguments(SuperCall call) {
        FunctionSignature signature = scope.getMethodCallSignature(call.getIdentifier(),call.getArguments());
        generateArguments(call,signature);
    }

    private void generateArguments(ConstructorCall call) {
        FunctionSignature signature = scope.getConstructorCallSignature(call.getIdentifier(),call.getArguments());
        generateArguments(call,signature);
    }

    private void generateArguments(Call call, FunctionSignature signature) {
        List<Parameter> parameters = signature.getParameters();
        List<Argument> arguments = call.getArguments();
        if (arguments.size() > parameters.size()) {
            throw new BadArgumentsToFunctionCallException(call);
        }
        arguments = getSortedArguments(arguments,parameters);
        arguments.forEach(argument -> argument.accept(expressionGenerator));
        generateDefaultParameters(call, parameters, arguments);
    }

    private List<Argument> getSortedArguments(List<Argument> arguments , List<Parameter> parameters) {
        Comparator<Argument> argumentIndexComparator = (o1, o2) -> {
            if (!o1.getParameterName().isPresent()) return 0;
            return getIndexOfArgument(o1, parameters) - getIndexOfArgument(o2, parameters);
        };
        return Ordering.from(argumentIndexComparator).immutableSortedCopy(arguments);
    }

    private Integer getIndexOfArgument(Argument argument, List<Parameter> parameters ) {
        String paramName = argument.getParameterName().get();
        return parameters.stream()
                .filter(p -> p.getName().equals(paramName))
                .map(parameters::indexOf)
                .findFirst()
                .orElseThrow(() -> new WrongArgumentNameException(argument, parameters));
    }

    private void generateDefaultParameters(Call call, List<Parameter> parameters, List<Argument> arguments) {
        for (int i = arguments.size(); i < parameters.size(); i++) {
            Expression defaultParameter = parameters.get(i).getDefaultValue()
                    .orElseThrow(() -> new BadArgumentsToFunctionCallException(call));
            defaultParameter.accept(expressionGenerator);
        }
    }
}