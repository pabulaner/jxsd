package io.github.pabulaner.jxsd.spec.parser.extra;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.spec.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;
import io.github.pabulaner.jxsd.spec.util.RestrictionUtil;

import javax.lang.model.element.Modifier;

public class AddBuilderMethodToModelParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaClass spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder builder = ctx.get(SpecKey.BUILDER);
        Resolver resolver = ctx.get(SpecKey.BUILDER_RESOLVER);

        JavaType specType = spec.getType();
        TypeName builderTypeName = ParserUtil.convertType(specType, resolver);

        builder.addMethod(MethodSpec.methodBuilder("builder")
                .addModifiers(Modifier.PUBLIC)
                .returns(builderTypeName)
                .addStatement("return new $T().from(this)", builderTypeName)
                .build());

        ctx.next();
    }
}
