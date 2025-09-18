package io.github.pabulaner.jxsd.spec.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.gen.resolver.Resolver;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.gen.util.RestrictionUtil;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;

import javax.lang.model.element.Modifier;

public class RestrictionBuilderParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaRestriction spec = ctx.get(SpecKey.SPEC);
        ctx.set(PrimitiveBuilderParser.PRIMITIVE, spec.getPrimitive());

        new PrimitiveBuilderParser().parse(ctx);
    }
}
