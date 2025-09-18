package io.github.pabulaner.jxsd.spec.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;

import javax.lang.model.element.Modifier;

public class PrimitiveConverterParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaEnum spec = ctx.get(SpecKey.SPEC);
        MethodSpec.Builder fromBuilder = ctx.get(ConverterParser.FROM_BUILDER);
        MethodSpec.Builder toBuilder = ctx.get(ConverterParser.TO_BUILDER);
        Resolver modelResolver = ctx.get(SpecKey.MODEL_RESOLVER);

        JavaType specType = spec.getType();
        TypeName modelTypeName = ParserUtil.convertType(specType, modelResolver);

        ///
        /// ---- FROM ----
        ///

        fromBuilder.addStatement("return new $T(value)", modelTypeName);

        ///
        /// ---- TO ----
        ///

        toBuilder.addStatement("return value.getValue()");
        ctx.next();
    }
}
