package io.github.pabulaner.jxsd.spec.parser;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;

import java.util.ArrayList;
import java.util.List;

public abstract class ComplexSpecParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaChoice spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder builder = ctx.get(SpecKey.BUILDER);

        spec.getInners().forEach(inner -> {
            List<JavaClass> outer = ctx.getOrDefault(SpecKey.OUTER, List.of());
            outer = new ArrayList<>(outer);
            outer.add(spec);

            SpecContext copy = ctx.copy();
            copy.set(SpecKey.OUTER, outer);
            copy.next();

            TypeSpec.Builder innerBuilder = copy.get(SpecKey.BUILDER);
            builder.addType(innerBuilder.build());
        });
    }
}
