package io.github.pabulaner.jxsd.spec.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.spec.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;

import javax.lang.model.element.Modifier;

public class PrimitiveBuilderParser implements SpecParser {

    public static final String PRIMITIVE = "primitive";

    @Override
    public void parse(SpecContext ctx) {
        JavaClass spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder specBuilder = ctx.get(SpecKey.BUILDER);
        MethodSpec.Builder fromBuilder = ctx.get(BuilderParser.FROM_BUILDER);
        MethodSpec.Builder buildBuilder = ctx.get(BuilderParser.BUILD_BUILDER);
        Resolver modelResolver = ctx.get(SpecKey.MODEL_RESOLVER);
        Resolver builderResolver = ctx.get(SpecKey.BUILDER_RESOLVER);

        JavaType specType = spec.getType();
        JavaType primitiveType = ctx.getOrDefault(PRIMITIVE, specType);

        TypeName modelTypeName = ParserUtil.convertType(specType, modelResolver);
        TypeName builderTypeName = ParserUtil.convertType(specType, builderResolver);
        TypeName primitiveTypeName = ParserUtil.convertPrimitive(primitiveType);

        specBuilder.addModifiers(Modifier.PUBLIC);

        if (!ctx.has(PRIMITIVE)) {
            specBuilder.addField(primitiveTypeName, "value", Modifier.PROTECTED);
        }

        specBuilder.addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .build())
                .addMethod(MethodSpec.methodBuilder("setValue")
                        .addModifiers(Modifier.PUBLIC)
                        .returns(builderTypeName)
                        .addParameter(primitiveTypeName, "value")
                        .addStatement("this.value = value")
                        .addStatement("return this")
                        .build());

        fromBuilder.addStatement("this.value = value.getValue()").addStatement("return this");
        buildBuilder.addStatement("return new $T(this.value)", modelTypeName);

        ctx.next();
    }
}
