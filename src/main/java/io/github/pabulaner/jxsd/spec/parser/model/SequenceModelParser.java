package io.github.pabulaner.jxsd.spec.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;
import io.github.pabulaner.jxsd.spec.util.ParserUtil;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.parser.ComplexSpecParser;
import io.github.pabulaner.jxsd.util.Name;

import javax.lang.model.element.Modifier;

public class SequenceModelParser extends ComplexSpecParser {

    @Override
    public void parse(SpecContext ctx) {
        super.parse(ctx);

        JavaSequence spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder builder = ctx.get(SpecKey.BUILDER);
        Resolver resolver = ctx.get(SpecKey.MODEL_RESOLVER);

        JavaType specType = spec.getType();
        MethodSpec.Builder constructor = MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC);

        spec.getFields().forEach(field -> {
            TypeName fieldTypeName = ParserUtil.convertType(field.getType(), resolver);
            Name fieldName = new Name(resolver.resolve(specType, field.getName()));
            String fieldNameLower = fieldName.toVarLower();
            String fieldNameUpper = fieldName.toVarUpper();

            constructor.addParameter(fieldTypeName, fieldNameLower)
                    .addStatement("this.$N = $N", fieldNameLower, fieldNameLower);

            builder.addField(fieldTypeName, fieldNameLower, Modifier.PRIVATE, Modifier.FINAL)
                    .addMethod(MethodSpec.methodBuilder("get" + fieldNameUpper)
                            .addModifiers(Modifier.PUBLIC)
                            .returns(fieldTypeName)
                            .addStatement("return this.$N", fieldNameLower)
                            .build());
        });

        builder.addMethod(constructor.build());
        ctx.next();
    }
}
