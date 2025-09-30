package io.github.pabulaner.jxsd;

import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaInterface;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.SpecParserFilter;
import io.github.pabulaner.jxsd.spec.SpecParserMap;
import io.github.pabulaner.jxsd.spec.SpecParserSwitch;
import io.github.pabulaner.jxsd.spec.parser.builder.BuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.ChoiceBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.EnumBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.InterfaceBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.SequenceBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.builder.UnionBuilderParser;
import io.github.pabulaner.jxsd.spec.parser.converter.ChoiceConverterParser;
import io.github.pabulaner.jxsd.spec.parser.converter.ConverterParser;
import io.github.pabulaner.jxsd.spec.parser.fix.SystemColorConverterParser;
import io.github.pabulaner.jxsd.spec.parser.fix.SystemColorValConverterParser;
import io.github.pabulaner.jxsd.spec.parser.converter.EnumConverterParser;
import io.github.pabulaner.jxsd.spec.parser.converter.InterfaceConverterParser;
import io.github.pabulaner.jxsd.spec.parser.converter.PrimitiveConverterParser;
import io.github.pabulaner.jxsd.spec.parser.converter.RestrictionConverterParser;
import io.github.pabulaner.jxsd.spec.parser.converter.SequenceConverterParser;
import io.github.pabulaner.jxsd.spec.parser.converter.UnionConverterParser;
import io.github.pabulaner.jxsd.spec.parser.extra.AddBuilderMethodToModelParser;
import io.github.pabulaner.jxsd.spec.parser.extra.AddJavadocToClassParser;
import io.github.pabulaner.jxsd.spec.parser.extra.AddPkgToContextParser;
import io.github.pabulaner.jxsd.spec.parser.model.ChoiceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.EnumModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.InterfaceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.ModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.SequenceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.UnionModelParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;

import java.util.List;
import java.util.function.Predicate;

public final class SpecParsers {

    private static final Predicate<SpecContext> PRIMITIVE_PREDICATE = ctx -> {
        JavaClass spec = ctx.get(SpecKey.SPEC);
        return !(spec instanceof JavaPrimitive || spec instanceof JavaRestriction);
    };

    private SpecParsers() {
        // empty
    }

    public static List<SpecParser> getModelParsers(Resolver resolver) {
        return List.of(
                new SpecParserFilter(PRIMITIVE_PREDICATE),
                new AddPkgToContextParser(resolver),
                new ModelParser(),
                new AddBuilderMethodToModelParser(),
                new AddJavadocToClassParser(),
                new SpecParserMap()
                        .add(JavaUnion.class, new UnionModelParser())
                        .add(JavaEnum.class, new EnumModelParser())
                        .add(JavaSequence.class, new SequenceModelParser())
                        .add(JavaChoice.class, new ChoiceModelParser())
                        .add(JavaInterface.class, new InterfaceModelParser()));
    }

    public static List<SpecParser> getBuilderParsers(Resolver resolver) {
        return List.of(
                new SpecParserFilter(PRIMITIVE_PREDICATE),
                new AddPkgToContextParser(resolver),
                new BuilderParser(),
                new AddJavadocToClassParser(),
                new SpecParserMap()
                        .add(JavaUnion.class, new UnionBuilderParser())
                        .add(JavaEnum.class, new EnumBuilderParser())
                        .add(JavaSequence.class, new SequenceBuilderParser())
                        .add(JavaChoice.class, new ChoiceBuilderParser())
                        .add(JavaInterface.class, new InterfaceBuilderParser()));
    }

    public static List<SpecParser> getConverterParsers(Resolver resolver) {
        return List.of(
                new AddPkgToContextParser(resolver),
                new ConverterParser(),
                new AddJavadocToClassParser(),
                new SpecParserSwitch()
                        .add(isType("CT_SystemColor"), new SystemColorConverterParser())
                        .add(isType("ST_SystemColorVal"), new SystemColorValConverterParser())
                        .add(ctx -> true, new SpecParserMap()
                                .add(JavaPrimitive.class, new PrimitiveConverterParser())
                                .add(JavaRestriction.class, new RestrictionConverterParser())
                                .add(JavaUnion.class, new UnionConverterParser())
                                .add(JavaEnum.class, new EnumConverterParser())
                                .add(JavaSequence.class, new SequenceConverterParser())
                                .add(JavaChoice.class, new ChoiceConverterParser())
                                .add(JavaInterface.class, new InterfaceConverterParser())));
    }

    private static Predicate<SpecContext> isType(String name) {
        return ctx -> {
            JavaClass spec = ctx.get(SpecKey.SPEC);
            return spec.getType().getName().equals(name);
        };
    }
}
