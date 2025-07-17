package io.github.pabulaner.jxsd.out.parser.builder;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;
import io.github.pabulaner.jxsd.out.resolver.PkgResolver;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.util.List;

public class BuilderParserGroup implements ParserGroup {

    @Override
    public TypeSpec parse(boolean isStatic, JavaClass clazz) {
        return switch (clazz) {
            case JavaPrimitive casted -> new PrimitiveBuilderParser().parse(isStatic, casted);
            case JavaRestriction casted -> new RestrictionBuilderParser().parse(isStatic, casted);
            case JavaUnion casted -> new UnionBuilderParser().parse(isStatic, casted);
            case JavaEnum casted -> new EnumBuilderParser().parse(isStatic, casted);
            case JavaSequence casted -> new SequenceBuilderParser().parse(isStatic, casted);
            case JavaChoice casted -> new ChoiceBuilderParser().parse(isStatic, casted);
            default -> throw new IllegalStateException("Unexpected value: " + clazz);
        };
    }

    @Override
    public Resolver getResolver() {
        return new PkgResolver(List.of(), "builder");
    }
}
