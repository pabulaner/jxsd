package io.github.pabulaner.jxsd.spec.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.resolver.Resolver;
import io.github.pabulaner.jxsd.out.util.ParserUtil;
import io.github.pabulaner.jxsd.out.util.RestrictionUtil;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;

import javax.lang.model.element.Modifier;

public class RestrictionModelParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaScope scope = ctx.get(SpecKey.SCOPE);
        JavaRestriction spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder builder = ctx.get(SpecKey.BUILDER);
        Resolver resolver = ctx.get(SpecKey.MODEL_RESOLVER);

        JavaType specType = RestrictionUtil.findPrimitive(scope, spec.getType());
        JavaType primitiveType = RestrictionUtil.findPrimitive(scope, spec.getPrimitive());

        if (primitiveType.equals(specType)) {
            builder.superclass(ParserUtil.convertType(spec.getParent(), resolver))
                    .addMethod(MethodSpec.constructorBuilder()
                            .addModifiers(Modifier.PUBLIC)
                            .addParameter(ParserUtil.convertPrimitive(primitiveType), "value")
                            .addStatement("super(value)")
                            .build());

            ctx.next();
        } else {
            ctx.set(SpecKey.SPEC, new JavaPrimitive.Builder()
                    .setType(specType)
                    .build());

            new PrimitiveModelParser().parse(ctx);
        }
    }
}
