package io.github.pabulaner.jxsd.spec.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.parser.ComplexSpecParser;
import io.github.pabulaner.jxsd.util.Name;

import javax.lang.model.element.Modifier;

public class ChoiceModelParser extends ComplexSpecParser {

    @Override
    public void parse(SpecContext ctx) {
        super.parse(ctx);

        JavaChoice spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder builder = ctx.get(SpecKey.BUILDER);
        Resolver resolver = ctx.get(SpecKey.MODEL_RESOLVER);

        JavaType specType = spec.getType();

        builder.addField(TypeName.INT, "type", Modifier.PRIVATE, Modifier.FINAL)
                .addField(Object.class, "value", Modifier.PRIVATE, Modifier.FINAL)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("this(-1, null)")
                        .build())
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PRIVATE)
                        .addParameter(Integer.class, "type")
                        .addParameter(Object.class, "value")
                        .addStatement("this.type = type")
                        .addStatement("this.value = value")
                        .build());

        TypeName modelTypeName = ParserUtil.convertType(specType, resolver);
        int[] index = { 0 };

        spec.getFields().forEach(field -> {
            TypeName fieldTypeName = ParserUtil.convertType(field.getType(), resolver);
            Name fieldName = new Name(resolver.resolve(specType, field.getName()));
            String fieldNameUpper = fieldName.toVarUpper();

            builder.addMethod(MethodSpec.methodBuilder("new" + fieldNameUpper)
                            .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                            .returns(modelTypeName)
                            .addParameter(fieldTypeName, "value")
                            .addStatement("return new $T($L, value)", modelTypeName, index[0])
                            .build())
                    .addMethod(MethodSpec.methodBuilder("is" + fieldNameUpper)
                            .addModifiers(Modifier.PUBLIC)
                            .returns(TypeName.BOOLEAN)
                            .addStatement("return this.type == $L", index[0])
                            .build())
                    .addMethod(MethodSpec.methodBuilder("get" + fieldNameUpper)
                            .addModifiers(Modifier.PUBLIC)
                            .returns(fieldTypeName)
                            .addStatement("return ($T) this.value", fieldTypeName)
                            .build());

            index[0] += 1;
        });

        ctx.next();
    }
}
