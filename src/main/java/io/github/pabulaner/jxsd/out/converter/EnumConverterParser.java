package io.github.pabulaner.jxsd.out.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaSequence;

import javax.lang.model.element.Modifier;

public class EnumConverterParser extends ConverterParser<JavaEnum> {

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaEnum clazz) {
        return builder;
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaEnum clazz) {
        return builder;
    }
}
