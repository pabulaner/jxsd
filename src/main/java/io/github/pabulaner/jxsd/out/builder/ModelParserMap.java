package io.github.pabulaner.jxsd.out.builder;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.OutParserMap;

public class ModelParserMap implements OutParserMap {

    @Override
    public TypeSpec parse(boolean isStatic, JavaClass clazz) {
        return switch (clazz) {
            case JavaPrimitive casted -> new PrimitiveModelParser().parse(isStatic, casted);
            case JavaRestriction casted -> new RestrictionModelParser().parse(isStatic, casted);
            case JavaUnion casted -> new UnionModelParser().parse(isStatic, casted);
            case JavaEnum casted -> new EnumModelParser().parse(isStatic, casted);
            case JavaSequence casted -> new SequenceModelParser().parse(isStatic, casted);
            case JavaChoice casted -> new ChoiceModelParser().parse(isStatic, casted);
            default -> throw new IllegalStateException("Unexpected value: " + clazz);
        };
    }
}
