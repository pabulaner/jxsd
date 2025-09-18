package io.github.pabulaner.jxsd.spec.parser.model;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaInterface;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;

import javax.lang.model.element.Modifier;
import java.util.List;

public class ModelParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaClass spec = ctx.get(SpecKey.SPEC);
        List<JavaClass> outer = ctx.getOrDefault(SpecKey.OUTER, List.of());
        Resolver resolver = ctx.get(SpecKey.MODEL_RESOLVER);

        String name = resolver.resolve(spec.getType()).getName();
        TypeSpec.Builder builder = switch (spec) {
            case JavaInterface ignored -> TypeSpec.interfaceBuilder(name);
            case JavaEnum ignored -> TypeSpec.enumBuilder(name);
            default -> TypeSpec.classBuilder(name);
        };

        builder.addModifiers(Modifier.PUBLIC);

        if (!outer.isEmpty()) {
            builder.addModifiers(Modifier.STATIC);
        }

        ctx.set(SpecKey.BUILDER, builder);
        ctx.next();
    }
}
