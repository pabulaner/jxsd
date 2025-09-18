package io.github.pabulaner.jxsd.gen.parser.model;

import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.gen.parser.ParserGroup;
import io.github.pabulaner.jxsd.gen.parser.ParserMap;
import io.github.pabulaner.jxsd.gen.resolver.Resolver;
import io.github.pabulaner.jxsd.java.JavaInterface;

public class ModelParserGroup extends ParserGroup {

    public static final String NAME = "model";

    public ModelParserGroup(ParserMap map, Resolver resolver) {
        super(map, resolver);

        addParser(JavaPrimitive.class, new PrimitiveModelParser(this));
        addParser(JavaRestriction.class, new RestrictionModelParser(this));
        addParser(JavaUnion.class, new UnionModelParser(this));
        addParser(JavaEnum.class, new EnumModelParser(this));
        addParser(JavaSequence.class, new SequenceModelParser(this));
        addParser(JavaChoice.class, new ChoiceModelParser(this));
        addParser(JavaInterface.class, new InterfaceModelParser(this));
    }
}
