package io.github.pabulaner.jxsd.impl.out;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.api.java.IJavaClass;
import io.github.pabulaner.jxsd.api.java.IJavaField;
import io.github.pabulaner.jxsd.api.java.IJavaType;

import javax.lang.model.element.Modifier;
import java.util.List;

public class OutClassParser extends OutParser {

    public OutClassParser() {
    }

    @Override
    protected TypeSpec parseClass(IJavaClass java) {
        List<IJavaField> fields = java.fields();

        ClassName type = getBase(java.type());
        TypeSpec.Builder result = TypeSpec.classBuilder(type)
                .addModifiers(Modifier.PUBLIC);

        ClassName parent = getParent(java.type());

        if (parent != null) {
            if (java.type().kind() == IJavaType.Kind.LIST) {
                result.superclass(ClassName.get("java.util", "List<" + parent.simpleName() + ">"));
            } else {
                result.superclass(parent);
            }
        }

        parseFields(result, fields, Modifier.PRIVATE, Modifier.FINAL);
        parseConstructor(result, fields, Modifier.PUBLIC);
        parseGetters(result, fields);

        return result.build();
    }

    private void parseGetter(TypeSpec.Builder builder, IJavaField field) {
        MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder(field.name().withPrefix("get").part())
                .addModifiers(Modifier.PUBLIC)
                .returns(getBase(field.type()));

        methodBuilder.addStatement("return this.$L", field.name().valid());
        builder.addMethod(methodBuilder.build());
    }

    private void parseGetters(TypeSpec.Builder builder, List<IJavaField> fields) {
        fields.forEach(field -> parseGetter(builder, field));
    }
}
