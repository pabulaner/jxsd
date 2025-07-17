package io.github.pabulaner.jxsd.out.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.out.Name;
import io.github.pabulaner.jxsd.out.Util;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class SequenceModelParser extends BaseParser<JavaSequence> {

    public SequenceModelParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaSequence clazz) {
        // add inners
        clazz.inners().forEach(inner -> builder.addType(getGroup().parse(true, inner)));

        // init constructor
        MethodSpec.Builder constructor = MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC);

        // parse fields
        clazz.fields().forEach(field -> {
            TypeName fieldType = Util.convertType(field.type(), getResolver());
            Name fieldName = new Name(getResolver().resolve(field.type(), field.name()));

            // add constructor params and assignments
            constructor.addParameter(fieldType, fieldName.toVar())
                    .addStatement("$N.$N = $N", THIS, fieldName.toVar(), fieldName.toVar());

            // add fields and getters
            builder.addField(fieldType, fieldName.toVar(), Modifier.PRIVATE, Modifier.FINAL)
                    .addMethod(MethodSpec.methodBuilder(Util.convertMethodName(GET, fieldName.toUpper()))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(fieldType)
                            .addStatement("$N $N.$N", RETURN, THIS, fieldName.toVar())
                            .build());
        });

        // add constructor and return result
        return builder.addMethod(constructor.build());
    }
}
