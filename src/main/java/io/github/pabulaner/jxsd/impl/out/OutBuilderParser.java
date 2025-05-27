package io.github.pabulaner.jxsd.impl.out;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.api.java.IJavaClass;
import io.github.pabulaner.jxsd.api.java.IJavaField;

import javax.lang.model.element.Modifier;
import java.util.ArrayList;
import java.util.List;

public class OutBuilderParser extends OutParser {

    public OutBuilderParser() {
    }

    @Override
    protected TypeSpec parseClass(IJavaClass java) {
        List<IJavaField> fields = java.fields();

        ClassName type = getType(java.type().name());
        ClassName builderType = getType(java.type().name().withSuffix("builder"));
        TypeSpec.Builder result = TypeSpec.classBuilder(builderType)
                .addModifiers(Modifier.PUBLIC);

        parseFields(result, fields, Modifier.PRIVATE);
        parseConstructor(result, new ArrayList<>(), Modifier.PUBLIC);
        parseBuild(result, type, fields);
        parseSetters(result, builderType, fields);

        return result.build();
    }

    private void parseBuild(TypeSpec.Builder builder, ClassName type, List<IJavaField> fields) {
        MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder("build")
                .addModifiers(Modifier.PUBLIC);

        StringBuilder params = new StringBuilder();

        fields.forEach(field -> {
            if (!params.isEmpty()) {
                params.append(", ");
            }

            params.append(field.name().valid());
        });

        methodBuilder.addStatement("return new $L($L)", type, params);
        builder.addMethod(methodBuilder.build());
    }

    private void parseSetter(TypeSpec.Builder builder, ClassName type, IJavaField field) {
        MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder(field.name().withPrefix("set").upper().part())
                .addModifiers(Modifier.PUBLIC)
                .returns(type);

        methodBuilder.addStatement("this.$L = $L", field.name().valid(), field.name().valid());
        methodBuilder.addStatement("return this");

        builder.addMethod(methodBuilder.build());
    }

    private void parseSetters(TypeSpec.Builder builder, ClassName type, List<IJavaField> fields) {
        fields.forEach(field -> parseSetter(builder, type, field));
    }
}
