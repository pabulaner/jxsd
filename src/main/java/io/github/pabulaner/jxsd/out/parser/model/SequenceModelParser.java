package io.github.pabulaner.jxsd.out.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.util.Name;
import io.github.pabulaner.jxsd.out.util.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class SequenceModelParser extends ModelParser<JavaSequence> {

    public SequenceModelParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaSequence clazz) {
        super.parse(builder, clazz);
        clazz.getInners().forEach(inner -> builder.addType(getGroup().parse(true, inner)));

        MethodSpec.Builder constructor = MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC);

        clazz.getFields().forEach(field -> {
            TypeName fieldType = ParserUtil.convertType(field.getType(), getResolver());
            Name fieldName = new Name(getResolver().resolve(clazz.getType(), field.getName()));

            constructor.addParameter(fieldType, fieldName.toVarLower())
                    .addStatement("$N.$N = $N", THIS, fieldName.toVarLower(), fieldName.toVarLower());

            builder.addField(fieldType, fieldName.toVarLower(), Modifier.PRIVATE, Modifier.FINAL)
                    .addMethod(MethodSpec.methodBuilder(ParserUtil.convertMethodName(GET, fieldName.toVarUpper()))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(fieldType)
                            .addStatement("$N $N.$N", RETURN, THIS, fieldName.toVarLower())
                            .build());
        });

        return builder.addMethod(constructor.build());
    }
}
