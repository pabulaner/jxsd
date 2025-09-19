package io.github.pabulaner.jxsd;

import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaInterface;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.SpecParserFilter;
import io.github.pabulaner.jxsd.spec.SpecParserMap;
import io.github.pabulaner.jxsd.spec.parser.builder.BuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.ChoiceBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.EnumBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.InterfaceBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.PrimitiveBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.RestrictionBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.SequenceBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.UnionBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.extra.AddBuilderMethodToModelParser;
import io.github.pabulaner.jxsd.spec.parser.extra.AddJavadocToClassParser;
import io.github.pabulaner.jxsd.spec.parser.extra.AddPkgToContextParser;
import io.github.pabulaner.jxsd.spec.parser.model.ChoiceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.EnumModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.InterfaceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.ModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.PrimitiveModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.RestrictionModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.SequenceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.UnionModelParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;

import java.util.List;

public final class SpecParsers {

    private static final SpecParserFilter FILTER = new SpecParserFilter(ctx -> {
        JavaClass spec = ctx.get(SpecKey.SPEC);
        return !(spec instanceof JavaPrimitive || spec instanceof JavaRestriction);
    });

    private SpecParsers() {
        // empty
    }

    public static List<SpecParser> getModelParsers(Resolver resolver) {
        return List.of(
                FILTER,
                new ModelParser(),
                new AddPkgToContextParser(resolver),
                new AddBuilderMethodToModelParser(),
                new AddJavadocToClassParser(),
                new SpecParserMap()
                        // .add(JavaPrimitive.class, new PrimitiveModelParser())
                        // .add(JavaRestriction.class, new RestrictionModelParser())
                        .add(JavaUnion.class, new UnionModelParser())
                        .add(JavaEnum.class, new EnumModelParser())
                        .add(JavaSequence.class, new SequenceModelParser())
                        .add(JavaChoice.class, new ChoiceModelParser())
                        .add(JavaInterface.class, new InterfaceModelParser()));
    }

    public static List<SpecParser> getBuilderParsers(Resolver resolver) {
        return List.of(
                FILTER,
                new AddPkgToContextParser(resolver),
                new BuilderParser(),
                new AddJavadocToClassParser(),
                new SpecParserMap()
                        // .add(JavaPrimitive.class, new PrimitiveBuilderParser())
                        // .add(JavaRestriction.class, new RestrictionBuilderParser())
                        .add(JavaUnion.class, new UnionBuilderParser())
                        .add(JavaEnum.class, new EnumBuilderParser())
                        .add(JavaSequence.class, new SequenceBuilderParser())
                        .add(JavaChoice.class, new ChoiceBuilderParser())
                        .add(JavaInterface.class, new InterfaceBuilderParser()));
    }
}
