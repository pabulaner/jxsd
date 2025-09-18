package io.github.pabulaner.jxsd.spec.parser.extra;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;

import javax.lang.model.element.Modifier;

public class AddBuilderMethodToModelParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaClass spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder builder = ctx.get(SpecKey.BUILDER);
        Resolver resolver = ctx.get(SpecKey.BUILDER_RESOLVER);

        JavaType specType = spec.getType();
        TypeName builderTypeName = ParserUtil.convertType(specType, resolver);

        builder.addMethod(MethodSpec.methodBuilder("builder")
                        .addModifiers(Modifier.PUBLIC)
                        .returns(builderTypeName)
                        .addStatement("return new $T(this)", builderTypeName)
                .build());
    }
}
