package io.github.pabulaner.jxsd.impl.out;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.api.java.IJavaClass;
import io.github.pabulaner.jxsd.api.java.IJavaField;
import io.github.pabulaner.jxsd.api.java.IJavaName;

import javax.lang.model.element.Modifier;
import java.util.ArrayList;
import java.util.List;

public class OutToDocx4jParser extends OutParser {

    public OutToDocx4jParser() {
    }

    @Override
    protected TypeSpec parseClass(IJavaClass java) {
        List<IJavaField> fields = java.fields();

        ClassName resultType = getType(java.type().name().withSuffix("output"));
        ClassName modelType = getType(java.type().name());
        ClassName docx4jType = getDocx4jType(java.type().name());

        TypeSpec.Builder result = TypeSpec.classBuilder(resultType)
                .addModifiers(Modifier.PUBLIC);

        parseConstructor(result, new ArrayList<>(), Modifier.PRIVATE);
        parseOutput(result, modelType, docx4jType, fields);

        return result.build();
    }

    private void parseOutput(TypeSpec.Builder builder, ClassName modelType, ClassName docx4jType, List<IJavaField> fields) {
        MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder("output")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(docx4jType)
                .addParameter(modelType, "value");

        methodBuilder.addStatement("$L result = new $L()", docx4jType, docx4jType);

        forEach(fields, (type, name) -> {
            String fieldName = name.upper();
            String outputName = type.simpleName() + "Output";

            methodBuilder.addStatement("result.set$L($L.output(value.get$L()))", fieldName, outputName, fieldName);
        });

        methodBuilder.addStatement("return result");
        builder.addMethod(methodBuilder.build());
    }

    private ClassName getDocx4jType(IJavaName name) {
        String raw = name.raw().replaceAll("_", "");
        return ClassName.get("", raw);
    }
}
