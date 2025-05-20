package io.github.pabulaner.jxsd.impl;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.api.java.IJavaClass;
import io.github.pabulaner.jxsd.api.java.IJavaField;
import io.github.pabulaner.jxsd.api.java.IJavaModel;
import io.github.pabulaner.jxsd.api.java.IJavaType;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.BiConsumer;

public class JavaWriter {

    public void write(List<IJavaModel> models) {
        models.forEach(this::writeModel);
    }

    private void writeModel(IJavaModel java) {
        if (java instanceof IJavaClass javaClass) {
            writeClass(javaClass);
        }
    }

    private void writeClass(IJavaClass javaClass) {
        List<IJavaField> fields = javaClass.fields();

        TypeSpec.Builder result = TypeSpec.classBuilder(getName(javaClass.type().name()))
                .addModifiers(Modifier.PUBLIC)
                .superclass(ClassName.get("", javaClass.type().parent()));

        MethodSpec.Builder constructor = MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PROTECTED);

        forEach(fields, (type, name) -> result.addField(type, name, Modifier.PRIVATE, Modifier.FINAL));
        forEach(fields, constructor::addParameter);
        forEach(fields, (type, name) -> constructor.addCode(CodeBlock.builder()
                .addStatement("this.$L = $L", name, name)
                .build()));

        forEach(fields, (type, name) -> {
            MethodSpec.Builder getter = MethodSpec.methodBuilder("get" + getName(name))
                    .addModifiers(Modifier.PUBLIC)
                    .returns(type)
                    .addStatement("return this.$L", name);

            result.addMethod(getter.build());
        });

        result.addMethod(constructor.build());

        TypeSpec.Builder builder = TypeSpec.classBuilder(getName(javaClass.type().name() + "Builder"))
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC);

        MethodSpec.Builder build = MethodSpec.methodBuilder("build")
                        .returns(ClassName.get("", getName(javaClass.type().name())));

        forEach(fields, (type, name) -> builder.addField(type, name, Modifier.PRIVATE));

        StringBuilder args = new StringBuilder();

        forEach(fields, (type, name) -> {
            if (!args.isEmpty()) {
                args.append(", ");
            }

            args.append(name);
        });

        build.addStatement("return new $L($L)", getName(javaClass.type().name()), args);

        forEach(fields, (type, name) -> {
            MethodSpec.Builder setter = MethodSpec.methodBuilder("set" + getName(name))
                    .addModifiers(Modifier.PUBLIC)
                    .returns(ClassName.get("", getName(javaClass.type().name()) + "Builder"))
                    .addParameter(type, name)
                    .addStatement("this.$L = $L", name, name)
                    .addStatement("return this");

            builder.addMethod(setter.build());
        });

        builder.addMethod(build.build());
        result.addType(builder.build());

        try {
            JavaFile.builder("", result.build())
                    .build()
                    .writeTo(System.out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void forEach(List<IJavaField> fields, BiConsumer<ClassName, String> consumer) {
        fields.forEach(field -> {
            String name = field.name();
            ClassName type = getType(field.type());

            consumer.accept(type, name);
        });
    }

    private ClassName getType(IJavaType type) {
        return ClassName.get("", type.name());
    }

    private String getName(String name) {
        if (name.isEmpty()) {
            return name;
        }

        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
