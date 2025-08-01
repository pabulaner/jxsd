package io.github.pabulaner.jxsd.out.parser.builder;

import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;
import io.github.pabulaner.jxsd.out.parser.ParserMap;
import io.github.pabulaner.jxsd.out.resolver.Resolver;
import io.github.pabulaner.jxsd.java.JavaInterface;

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
        addParser(JavaInterface.class, new InterfaceBuilderParser(this));
    }
}
