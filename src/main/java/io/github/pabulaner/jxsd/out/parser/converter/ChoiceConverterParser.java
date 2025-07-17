package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

public class ChoiceConverterParser extends ConverterParser<JavaChoice> {

    public ChoiceConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaChoice clazz) {
        clazz.inners().forEach(inner -> builder.addType(getGroup().parse(true, inner)));
        return super.parse(builder, clazz);
    }

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaChoice clazz) {
        return builder;
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaChoice clazz) {
        return builder;
    }
}
