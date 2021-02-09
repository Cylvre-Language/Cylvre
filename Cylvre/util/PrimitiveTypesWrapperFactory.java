package Cylvre.util;

import Cylvre.domain.type.BuiltInType;
import Cylvre.domain.type.ClassType;
import Cylvre.domain.type.Type;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;

public class PrimitiveTypesWrapperFactory {

    private final static BiMap<BuiltInType, ClassType> types = ImmutableBiMap.of(
            BuiltInType.INT,ClassType.Integer(),
            BuiltInType.BOOLEAN,ClassType.Boolean(),
            BuiltInType.FLOAT,ClassType.Float(),
            BuiltInType.DOUBLE,ClassType.Double()
    );

    private final static Map<Type,String> toPrimitiveMethodName = ImmutableMap.of(
            ClassType.Integer(),"intValue"
    );

    public static Optional<BuiltInType> getPrimitiveForWrapper(Type type) {
        return Optional.ofNullable(types.inverse().get(type));
    }

    public static Optional<ClassType> getWrapperForPrimitive(Type type) {
        return Optional.ofNullable(types.get(type));
    }

}
