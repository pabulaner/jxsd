package io.github.pabulaner.jxsd.spec.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.util.ParserUtil;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;

import javax.lang.model.element.Modifier;
import java.util.List;

public class UnionModelParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        TypeSpec.Builder builder = ctx.get(SpecKey.BUILDER);

        builder.addField(String.class, "value", Modifier.PRIVATE, Modifier.FINAL)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(String.class, "value")
                        .addStatement("this.value = value")
                        .build())
                .addMethod(MethodSpec.methodBuilder("getValue")
                        .addModifiers(Modifier.PUBLIC)
                        .returns(String.class)
                        .addStatement("return this.value")
                        .build());

        ctx.next();
    }
}
