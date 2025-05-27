package io.github.pabulaner.jxsd.impl.out;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.api.java.IJavaClass;
import io.github.pabulaner.jxsd.api.java.IJavaField;
import io.github.pabulaner.jxsd.api.java.IJavaModel;
import io.github.pabulaner.jxsd.api.java.IJavaName;
import io.github.pabulaner.jxsd.api.java.IJavaType;
import io.github.pabulaner.jxsd.api.out.IOutParser;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.util.List;
import java.util.function.BiConsumer;

public abstract class OutParser implements IOutParser {

    private static final String UTIL_PACKAGE = "java.util";

    protected OutParser() {
    }

    @Override
    public void parse(List<IJavaModel> models) {
        models.forEach(this::parseModel);
    }

    private void parseModel(IJavaModel java) {
        if (java instanceof IJavaClass javaClass) {
            TypeSpec result = parseClass(javaClass);

            try {
                JavaFile.builder("", result)
                        .build()
                        .writeTo(System.out);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    protected abstract TypeSpec parseClass(IJavaClass java);

    protected void parseFields(TypeSpec.Builder builder, List<IJavaField> fields, Modifier... modifiers) {
        forEach(fields, (type, name) -> builder.addField(type, name.valid(), modifiers));
    }

    protected void parseConstructor(TypeSpec.Builder builder, List<IJavaField> params, Modifier... modifiers) {
        MethodSpec.Builder constructorBuilder = MethodSpec.constructorBuilder()
                .addModifiers(modifiers);

        forEach(params, (type, name) -> {
            constructorBuilder.addParameter(type, name.valid());
            constructorBuilder.addStatement("this.$L = $L", name.valid(), name.valid());
        });

        builder.addMethod(constructorBuilder.build());
    }

    protected void forEach(List<IJavaField> fields, BiConsumer<ClassName, IJavaName> consumer) {
        fields.forEach(field -> {
            IJavaName name = field.name();
            ClassName type = field.type() != null
                    ? getBase(field.type())
                    : null;

            if (type != null) {
                consumer.accept(type, name);
            }
        });
    }

    protected ClassName getType(IJavaName name) {
        return ClassName.get("", name.upper().part());
    }

    protected ClassName getBase(IJavaType type) {
        return getType(type.name());
    }

    protected ClassName getParent(IJavaType type) {
        if (type.parent() != null) {
            return getType(type.parent());
        } else {
            return null;
        }
    }

    protected ClassName getList(IJavaType type) {
        return ClassName.get(UTIL_PACKAGE, "List<" + type + ">");
    }
}
