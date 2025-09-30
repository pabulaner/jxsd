package io.github.pabulaner.jxsd.spec.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaComplex;
import io.github.pabulaner.jxsd.spec.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.parser.ComplexSpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;
import io.github.pabulaner.jxsd.util.Name;

public class ChoiceConverterParser extends ComplexSpecParser {

    @Override
    public void parse(SpecContext ctx) {
        super.parse(ctx);

        JavaComplex spec = ctx.get(SpecKey.SPEC);
        MethodSpec.Builder fromBuilder = ctx.get(ConverterParser.FROM_BUILDER);
        MethodSpec.Builder toBuilder = ctx.get(ConverterParser.TO_BUILDER);
        Resolver modelResolver = ctx.get(SpecKey.MODEL_RESOLVER);
        Resolver converterResolver = ctx.get(SpecKey.CONVERTER_RESOLVER);
        Resolver docx4jResolver = ctx.get(SpecKey.DOCX4J_RESOLVER);

        JavaType specType = spec.getType();
        TypeName modelTypeName = ParserUtil.convertType(specType, modelResolver);
        TypeName docx4jTypeName = ParserUtil.convertType(specType, docx4jResolver);

        toBuilder.addStatement("$T result = new $T()", docx4jTypeName, docx4jTypeName);

        spec.getFields().forEach(field -> {
            JavaType fieldType = modelResolver.resolve(field.getType());
            String fieldName = new Name(docx4jResolver.resolve(specType, field.getName())).toVarUpper();
            TypeName fieldConverterTypeName = ParserUtil.convertType(field.getType(), converterResolver, false);

            if (fieldType.isList()) {
                throw new UnsupportedOperationException("Not implemented");
            } else {
                fromBuilder.addStatement("if (value.get$N() != null) return $T.new$N($T.fromDocx4j(value.get$N()))", fieldName, modelTypeName, fieldName, fieldConverterTypeName, fieldName);
                toBuilder.addStatement("if (value.is$N()) result.set$N($T.toDocx4j(value.get$N()))", fieldName, fieldName, fieldConverterTypeName, fieldName);
            }
        });

        fromBuilder.addStatement("return new $T()", modelTypeName);
        toBuilder.addStatement("return result");

        ctx.next();
    }
}
