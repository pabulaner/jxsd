package io.github.pabulaner.jxsd.spec.parser.model;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaInterface;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.out.resolver.Resolver;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.SpecParserMap;

public class ModelParser implements SpecParser<JavaClass> {

    private final SpecParserMap map;

    public ModelParser() {
        map = new SpecParserMap();
        map.add(JavaPrimitive.class, new PrimitiveModelParser());
    }

    @Override
    public void parse(SpecContext<JavaClass> ctx) {
        JavaClass spec = ctx.getSpec();
        String name = ctx.getResolver()
                .resolve(spec.getType())
                .getName();

        TypeSpec.Builder builder = switch (spec) {
            case JavaInterface ignored -> TypeSpec.interfaceBuilder(name);
            case JavaEnum ignored -> TypeSpec.enumBuilder(name);
            default -> TypeSpec.classBuilder(name);
        };

        ctx.setBuilder(builder);
        map.parse(ctx);
    }
}
