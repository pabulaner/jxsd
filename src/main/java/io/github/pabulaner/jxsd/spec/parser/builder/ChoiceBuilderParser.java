package io.github.pabulaner.jxsd.spec.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.parser.ComplexSpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;
import io.github.pabulaner.jxsd.util.Name;

import javax.lang.model.element.Modifier;

public class ChoiceBuilderParser extends ComplexSpecParser {

    @Override
    public void parse(SpecContext ctx) {
        super.parse(ctx);

        JavaChoice spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder specBuilder = ctx.get(SpecKey.BUILDER);
        MethodSpec.Builder fromBuilder = ctx.get(BuilderParser.FROM_BUILDER);
        MethodSpec.Builder buildBuilder = ctx.get(BuilderParser.BUILD_BUILDER);
        io.github.pabulaner.jxsd.spec.resolver.Resolver modelResolver = ctx.get(SpecKey.MODEL_RESOLVER);
        Resolver builderResolver = ctx.get(SpecKey.BUILDER_RESOLVER);

        JavaType specType = spec.getType();
        TypeName modelType = ParserUtil.convertType(specType, modelResolver);
        TypeName builderType = ParserUtil.convertType(specType, builderResolver);

        fromBuilder.addStatement("this.type = -1").addStatement("this.value = null");
        buildBuilder.addStatement("if (this.type == -1) return new $T()", modelType);

        specBuilder.addField(TypeName.INT, "type", Modifier.PRIVATE)
                .addField(Object.class, "value", Modifier.PRIVATE)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("this.type = -1")
                        .addStatement("this.value = null")
                        .build());

        int[] index = { 0 };

        spec.getFields().forEach(field -> {
            TypeName fieldTypeName = ParserUtil.convertType(field.getType(), modelResolver);
            String fieldName = new Name(builderResolver.resolve(specType, field.getName())).toUpper();

            fromBuilder.beginControlFlow("if (value.is$N())", fieldName)
                    .addStatement("this.type = $L", index[0])
                    .addStatement("this.value = value.get()", fieldName)
                    .endControlFlow();

            buildBuilder.addStatement("if (this.type == $L) return $T.new$N(($T) this.value)", index[0], modelType, fieldName, fieldTypeName);
            specBuilder.addMethod(MethodSpec.methodBuilder("set" + fieldName)
                    .addModifiers(Modifier.PUBLIC)
                    .returns(builderType)
                    .addParameter(fieldTypeName, "value")
                    .addStatement("this.type = $L", index[0])
                    .addStatement("this.value = value")
                    .addStatement("return this")
                    .build());

            index[0] += 1;
        });

        fromBuilder.addStatement("return this");
        buildBuilder.addStatement("return null");

        ctx.next();
    }
}
