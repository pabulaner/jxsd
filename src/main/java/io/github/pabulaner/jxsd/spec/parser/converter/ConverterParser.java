package io.github.pabulaner.jxsd.spec.parser.converter;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.gen.util.RestrictionUtil;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;

import javax.lang.model.element.Modifier;
import java.util.List;

public class ConverterParser implements SpecParser {

    public static final String FROM_BUILDER = "from_builder";

    public static final String TO_BUILDER = "to_builder";

    @Override
    public void parse(SpecContext ctx) {
        JavaClass spec = ctx.get(SpecKey.SPEC);
        List<JavaClass> outer = ctx.getOrDefault(SpecKey.OUTER, List.of());
        Resolver modelResolver = ctx.get(SpecKey.MODEL_RESOLVER);
        Resolver converterResolver = ctx.get(SpecKey.CONVERTER_RESOLVER);

        JavaType specType = spec.getType();
        TypeName modelTypeName = ParserUtil.convertType(specType, modelResolver);
        TypeName docx4jTypeName = parseDocx4jTypeName(ctx);
        String name = converterResolver.resolve(spec.getType()).getName();

        TypeSpec.Builder specBuilder = TypeSpec.classBuilder(name).addMethod(MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PRIVATE)
                .build());
        MethodSpec.Builder fromBuilder = MethodSpec.methodBuilder("fromDocx4j")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(modelTypeName)
                .addParameter(docx4jTypeName, "value")
                .addStatement("if (value == null) return null");
        MethodSpec.Builder toBuilder = MethodSpec.methodBuilder("toDocx4j")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(docx4jTypeName)
                .addParameter(ParserUtil.convertType(specType, modelResolver), "value")
                .addStatement("if (value == null) return null");

        if (!outer.isEmpty()) {
            specBuilder.addModifiers(Modifier.STATIC);
        }

        ctx.set(SpecKey.BUILDER, specBuilder);
        ctx.set(FROM_BUILDER, fromBuilder);
        ctx.set(TO_BUILDER, toBuilder);
        ctx.next();

        specBuilder.addMethod(fromBuilder.build()).addMethod(toBuilder.build());
    }

    private TypeName parseDocx4jTypeName(SpecContext ctx) {
        JavaScope scope = ctx.get(SpecKey.SCOPE);
        JavaClass spec = ctx.get(SpecKey.SPEC);
        Resolver resolver = ctx.get(SpecKey.DOCX4J_RESOLVER);

        JavaType specType = spec.getType();

        return switch (spec) {
            case JavaPrimitive ignored -> ParserUtil.convertPrimitive(specType, true);
            case JavaRestriction ignored -> {
                JavaType primitive = RestrictionUtil.findPrimitive(scope, specType);
                yield ParserUtil.convertPrimitive(primitive, true);
            }
            case JavaUnion ignored -> ClassName.get(String.class);
            default -> ParserUtil.convertType(specType, resolver);
        };
    }
}
