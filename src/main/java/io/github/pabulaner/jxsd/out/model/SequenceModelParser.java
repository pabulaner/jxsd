package io.github.pabulaner.jxsd.out.model;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaSequence;

import javax.lang.model.element.Modifier;

public class SequenceModelParser extends ModelParser<JavaSequence> {

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaSequence clazz) {
        // add inners
        clazz.inners().forEach(inner -> builder.addType(new ModelParserMap().parse(true, inner)));

        // init constructor
        MethodSpec.Builder constructor = MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC);

        // parse fields
        clazz.fields().forEach(field -> {
            ClassName fieldType = parseType(field.type(), JavaName::toModel);
            JavaName fieldName = field.name();

            // add constructor params and assignments
            constructor.addParameter(fieldType, fieldName.toVar())
                    .addStatement("$N.$N = $N", THIS, fieldName.toVar(), fieldName.toVar());

            // add fields and getters
            builder.addField(fieldType, fieldName.toVar(), Modifier.PRIVATE, Modifier.FINAL)
                    .addMethod(MethodSpec.methodBuilder(parseMethod(GET, fieldName.toUpper()))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(fieldType)
                            .addStatement("$N $N.$N", RETURN, THIS, fieldName.toVar())
                            .build());
        });

        // add constructor and return result
        return builder.addMethod(constructor.build());
    }
}
