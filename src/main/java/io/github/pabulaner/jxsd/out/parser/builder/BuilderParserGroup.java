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
import io.github.pabulaner.jxsd.out.parser.ParserMap;
import io.github.pabulaner.jxsd.out.parser.model.ChoiceModelParser;
import io.github.pabulaner.jxsd.out.parser.model.EnumModelParser;
import io.github.pabulaner.jxsd.out.parser.model.PrimitiveModelParser;
import io.github.pabulaner.jxsd.out.parser.model.RestrictionModelParser;
import io.github.pabulaner.jxsd.out.parser.model.SequenceModelParser;
import io.github.pabulaner.jxsd.out.parser.model.UnionModelParser;
import io.github.pabulaner.jxsd.out.resolver.PkgResolver;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.util.List;

public class BuilderParserGroup extends ParserGroup {

    public static final String NAME = "builder";

    public BuilderParserGroup(ParserMap map, Resolver resolver) {
        super(map, resolver);

        addParser(JavaPrimitive.class, new PrimitiveBuilderParser(this));
        addParser(JavaRestriction.class, new RestrictionBuilderParser(this));
        addParser(JavaUnion.class, new UnionBuilderParser(this));
        addParser(JavaEnum.class, new EnumBuilderParser(this));
        addParser(JavaSequence.class, new SequenceBuilderParser(this));
        addParser(JavaChoice.class, new ChoiceBuilderParser(this));
    }
}
