package io.github.pabulaner.jxsd.spec.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.spec.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;

public class UnionConverterParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaUnion spec = ctx.get(SpecKey.SPEC);
        MethodSpec.Builder fromBuilder = ctx.get(ConverterParser.FROM_BUILDER);
        MethodSpec.Builder toBuilder = ctx.get(ConverterParser.TO_BUILDER);
        Resolver modelResolver = ctx.get(SpecKey.MODEL_RESOLVER);
        Resolver docx4jResolver = ctx.get(SpecKey.BUILDER_RESOLVER);

        JavaType specType = spec.getType();
        TypeName modelTypeName = ParserUtil.convertType(specType, modelResolver);
        TypeName docx4jTypeName = ParserUtil.convertType(specType, docx4jResolver);

        fromBuilder.addStatement("return new $T(value)", modelTypeName);
        toBuilder.addStatement("return value.getValue()");

        ctx.next();
    }
}
