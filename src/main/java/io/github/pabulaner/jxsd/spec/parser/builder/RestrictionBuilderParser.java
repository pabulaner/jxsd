package io.github.pabulaner.jxsd.spec.parser.builder;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;
import io.github.pabulaner.jxsd.spec.util.ParserUtil;
import io.github.pabulaner.jxsd.spec.util.RestrictionUtil;

public class RestrictionBuilderParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaScope scope = ctx.get(SpecKey.SCOPE);
        JavaRestriction spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder builder = ctx.get(SpecKey.BUILDER);
        Resolver resolver = ctx.get(SpecKey.BUILDER_RESOLVER);

        JavaType specType = RestrictionUtil.findPrimitive(scope, spec.getType());
        JavaType primitiveType = RestrictionUtil.findPrimitive(scope, spec.getPrimitive());

        if (primitiveType.equals(specType)) {
            builder.superclass(ParserUtil.convertType(spec.getParent(), resolver));
        }

        ctx.set(SpecKey.SPEC, new JavaPrimitive.Builder()
                .setType(specType)
                .build());

        new PrimitiveBuilderParser().parse(ctx);
    }
}
