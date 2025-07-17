package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;
import io.github.pabulaner.jxsd.out.parser.ParserMap;
import io.github.pabulaner.jxsd.out.parser.builder.ChoiceBuilderParser;
import io.github.pabulaner.jxsd.out.parser.builder.EnumBuilderParser;
import io.github.pabulaner.jxsd.out.parser.builder.PrimitiveBuilderParser;
import io.github.pabulaner.jxsd.out.parser.builder.RestrictionBuilderParser;
import io.github.pabulaner.jxsd.out.parser.builder.SequenceBuilderParser;
import io.github.pabulaner.jxsd.out.parser.builder.UnionBuilderParser;
import io.github.pabulaner.jxsd.out.resolver.PkgResolver;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.util.List;

public class ConverterParserGroup extends ParserGroup {

    public static final String NAME = "converter";

    public ConverterParserGroup(ParserMap map, Resolver resolver) {
        super(map, resolver);

        addParser(JavaPrimitive.class, new PrimitiveConverterParser(this));
        addParser(JavaRestriction.class, new RestrictionConverterParser(this));
        addParser(JavaUnion.class, new UnionConverterParser(this));
        addParser(JavaEnum.class, new EnumConverterParser(this));
        addParser(JavaSequence.class, new SequenceConverterParser(this));
        addParser(JavaChoice.class, new ChoiceConverterParser(this));
    }
}
