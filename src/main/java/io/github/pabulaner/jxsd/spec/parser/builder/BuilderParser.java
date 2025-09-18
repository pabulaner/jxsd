package io.github.pabulaner.jxsd.spec.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.spec.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;

import javax.lang.model.element.Modifier;
import java.util.List;

public class BuilderParser implements SpecParser {

    public static final String FROM_BUILDER = "from_builder";

    public static final String BUILD_BUILDER = "build_builder";

    @Override
    public void parse(SpecContext ctx) {
        JavaClass spec = ctx.get(SpecKey.SPEC);
        List<JavaClass> outer = ctx.getOrDefault(SpecKey.OUTER, List.of());
        Resolver modelResolver = ctx.get(SpecKey.MODEL_RESOLVER);
        Resolver builderResolver = ctx.get(SpecKey.BUILDER_RESOLVER);

        JavaType specType = spec.getType();
        TypeName modelTypeName = ParserUtil.convertType(specType, modelResolver);
        TypeName builderTypeName = ParserUtil.convertType(specType, builderResolver);
        String name = builderResolver.resolve(spec.getType()).getName();

        TypeSpec.Builder specBuilder = TypeSpec.classBuilder(name).addModifiers(Modifier.PUBLIC);
        MethodSpec.Builder fromBuilder = MethodSpec.methodBuilder("from")
                .addModifiers(Modifier.PUBLIC)
                .returns(builderTypeName)
                .addParameter(modelTypeName, "value");
        MethodSpec.Builder buildBuilder = MethodSpec.methodBuilder("build")
                .addModifiers(Modifier.PUBLIC)
                .returns(modelTypeName);

        if (!outer.isEmpty()) {
            specBuilder.addModifiers(Modifier.STATIC);
        }

        ctx.set(SpecKey.BUILDER, specBuilder);
        ctx.set(FROM_BUILDER, fromBuilder);
        ctx.set(BUILD_BUILDER, buildBuilder);
        ctx.next();

        specBuilder.addMethod(fromBuilder.build()).addMethod(buildBuilder.build());
    }
}
