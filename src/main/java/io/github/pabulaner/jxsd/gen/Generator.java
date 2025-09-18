package io.github.pabulaner.jxsd.gen;

import io.github.pabulaner.jxsd.spec.parser.extra.AddBuilderMethodToModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.ChoiceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.EnumModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.InterfaceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.PrimitiveModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.RestrictionModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.SequenceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.UnionModelParser;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaInterface;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.SpecParserMap;
import io.github.pabulaner.jxsd.spec.parser.model.ModelParser;

import java.util.List;

public class Generator {

    private final GeneratorConfig config;

    public Generator(GeneratorConfig config) {
        this.config = config;
    }

    public void generate(JavaResult java) {
        List<SpecParser> parsers = List.of(
                new ModelParser(),
                new SpecParserMap()
                        .add(JavaPrimitive.class, new PrimitiveModelParser())
                        .add(JavaRestriction.class, new RestrictionModelParser())
                        .add(JavaUnion.class, new UnionModelParser())
                        .add(JavaEnum.class, new EnumModelParser())
                        .add(JavaSequence.class, new SequenceModelParser())
                        .add(JavaChoice.class, new ChoiceModelParser())
                        .add(JavaInterface.class, new InterfaceModelParser()),
                new AddBuilderMethodToModelParser()
        );
    }
}
