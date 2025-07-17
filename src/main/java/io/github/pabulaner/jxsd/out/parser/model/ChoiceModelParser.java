package io.github.pabulaner.jxsd.out.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.out.Util;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class ChoiceModelParser extends ModelParser<JavaChoice> {

    public ChoiceModelParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaChoice clazz) {
        // add inners
        clazz.inners().forEach(inner -> builder.addType(new ModelParserGroup().parse(true, inner)));

        // add fields and constructors
        builder.addField(TypeName.INT, TYPE, Modifier.PRIVATE, Modifier.FINAL)
                .addField(Object.class, VALUE, Modifier.PRIVATE, Modifier.FINAL)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("$N(-1, $N)", THIS, NULL)
                        .build())
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PRIVATE)
                        .addParameter(Integer.class, TYPE)
                        .addParameter(Object.class, VALUE)
                        .addStatement("$N.$N = $N", THIS, TYPE, TYPE)
                        .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                        .build());

        TypeName type = Util.convertType(clazz.type(), getResolver());
        int[] index = { 0 };

        // parse fields
        clazz.fields().forEach(field -> {
            TypeName fieldType = Util.convertType(field.type(), getResolver());
            String fieldName = getResolver().name(field.type(), field.name()).toUpper();

            // add static methods and is and get methods
            builder.addMethod(MethodSpec.methodBuilder(Util.convertMethodName(NEW, fieldName))
                            .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                            .returns(type)
                            .addParameter(fieldType, VALUE)
                            .addStatement("$N $N $T($L, $N)", RETURN, NEW, type, index[0], VALUE)
                            .build())
                    .addMethod(MethodSpec.methodBuilder(Util.convertMethodName(IS, fieldName))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(TypeName.BOOLEAN)
                            .addStatement("$N $N.$N == $L", RETURN, THIS, TYPE, index[0])
                            .build())
                    .addMethod(MethodSpec.methodBuilder(Util.convertMethodName(GET, fieldName))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(fieldType)
                            .addStatement("$N ($T) $N.$N", RETURN, fieldType, THIS, VALUE)
                            .build());

            index[0] += 1;
        });

        return builder;
    }
}
