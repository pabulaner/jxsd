package io.github.pabulaner.jxsd.out.parser.model;

import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;
import io.github.pabulaner.jxsd.out.parser.ParserMap;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

public class ModelParserGroup extends ParserGroup {

    public ModelParserGroup(ParserMap map, Resolver resolver) {
        super(map, resolver);

        addParser(JavaPrimitive.class, new PrimitiveModelParser(this));
        addParser(JavaRestriction.class, RestrictionModelParser::new);
        addParser(JavaUnion.class, UnionModelParser::new);
        addParser(JavaEnum.class, EnumModelParser::new);
        addParser(JavaSequence.class, SequenceModelParser::new);
        addParser(JavaChoice.class, ChoiceModelParser::new);
    }
}
