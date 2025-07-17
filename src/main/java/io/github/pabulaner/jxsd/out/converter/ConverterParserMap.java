package io.github.pabulaner.jxsd.out.converter;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.OutParserMap;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.util.List;

public class ConverterParserMap implements OutParserMap {

    @Override
    public TypeSpec parse(boolean isStatic, JavaClass clazz) {
        return switch (clazz) {
            case JavaPrimitive casted -> new PrimitiveConverterParser().parse(isStatic, casted);
            case JavaRestriction casted -> new RestrictionConverterParser().parse(isStatic, casted);
            case JavaUnion casted -> new UnionConverterParser().parse(isStatic, casted);
            case JavaEnum casted -> new EnumConverterParser().parse(isStatic, casted);
            case JavaSequence casted -> new SequenceConverterParser().parse(isStatic, casted);
            case JavaChoice casted -> new ChoiceConverterParser().parse(isStatic, casted);
            default -> throw new IllegalStateException("Unexpected value: " + clazz);
        };
    }

    @Override
    public Resolver getResolver() {
        return new Resolver(List.of(), "converter");
    }
}
