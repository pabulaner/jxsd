package io.github.pabulaner.jxsd.spec.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.spec.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.parser.ComplexSpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;
import io.github.pabulaner.jxsd.util.Name;

import javax.lang.model.element.Modifier;

public class SequenceBuilderParser extends ComplexSpecParser {

    @Override
    public void parse(SpecContext ctx) {
        super.parse(ctx);

        JavaSequence spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder specBuilder = ctx.get(SpecKey.BUILDER);
        MethodSpec.Builder fromBuilder = ctx.get(BuilderParser.FROM_BUILDER);
        MethodSpec.Builder buildBuilder = ctx.get(BuilderParser.BUILD_BUILDER);
        Resolver modelResolver = ctx.get(SpecKey.MODEL_RESOLVER);
        Resolver builderResolver = ctx.get(SpecKey.BUILDER_RESOLVER);

        JavaType specType = spec.getType();
        TypeName modelType = ParserUtil.convertType(specType, modelResolver);
        TypeName builderType = ParserUtil.convertType(specType, builderResolver);

        buildBuilder.addCode("return new $T(", modelType);

        specBuilder.addMethod(MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC)
                .build());

        boolean[] first = { true };

        spec.getFields().forEach(field -> {
            TypeName fieldTypeName = ParserUtil.convertType(field.getType(), modelResolver);
            Name fieldName = new Name(builderResolver.resolve(specType, field.getName()));
            String fieldNameLower = fieldName.toVarLower();
            String fieldNameUpper = fieldName.toVarUpper();

            if (first[0]) {
                first[0] = false;
            } else {
                buildBuilder.addCode(", ");
            }

            fromBuilder.addStatement("this.$N = value.get$N()", fieldNameLower, fieldNameUpper);
            buildBuilder.addCode("this.$N", fieldNameLower);

            specBuilder.addField(fieldTypeName, fieldNameLower, Modifier.PRIVATE)
                    .addMethod(MethodSpec.methodBuilder("set" + fieldNameUpper)
                            .addModifiers(Modifier.PUBLIC)
                            .returns(builderType)
                            .addParameter(fieldTypeName, fieldNameLower)
                            .addStatement("this.$N = $N", fieldNameLower, fieldNameLower)
                            .addStatement("return this")
                            .build());
        });

        fromBuilder.addStatement("return this");
        buildBuilder.addCode(");");

        ctx.next();
    }
}
