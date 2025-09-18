package io.github.pabulaner.jxsd.gen.parser.converter;

import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.util.Name;
import io.github.pabulaner.jxsd.gen.parser.ParserGroup;
import io.github.pabulaner.jxsd.gen.parser.ParserMap;
import io.github.pabulaner.jxsd.gen.resolver.PkgCleanResolver;
import io.github.pabulaner.jxsd.gen.resolver.PkgParentResolver;
import io.github.pabulaner.jxsd.gen.resolver.PkgRenameResolver;
import io.github.pabulaner.jxsd.gen.resolver.Resolver;
import io.github.pabulaner.jxsd.gen.resolver.TypeRenameResolver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConverterParserGroup extends ParserGroup {

    public static final String NAME = "converter";

    private final Resolver docx4jResolver;

    public ConverterParserGroup(ParserMap map, Resolver resolver) {
        super(map, resolver);

        Map<String, String> rename = new HashMap<>();
        rename.put("drawingml", "dml");
        rename.put("main", "");

        docx4jResolver = Resolver.combine(
                new PkgRenameResolver(rename),
                new PkgParentResolver(List.of("org", "docx4j")),
                new PkgCleanResolver(),
                new TypeRenameResolver((inner, value) -> new Name(value).toVarUpper()));

        addParser(JavaPrimitive.class, new PrimitiveConverterParser(this));
        addParser(JavaRestriction.class, new RestrictionConverterParser(this));
        addParser(JavaUnion.class, new UnionConverterParser(this));
        addParser(JavaEnum.class, new EnumConverterParser(this));
        addParser(JavaSequence.class, new SequenceConverterParser(this));
        addParser(JavaChoice.class, new ChoiceConverterParser(this));
    }

    public Resolver getDocx4jResolver() {
        return docx4jResolver;
    }
}
