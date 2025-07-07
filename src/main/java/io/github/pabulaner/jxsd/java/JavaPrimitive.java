package io.github.pabulaner.jxsd.java;

public record JavaPrimitive(JavaType type, JavaType primitive) implements JavaClass {

    @Override
    public JavaPrimitive withType(JavaType type) {
        return new JavaPrimitive(type, primitive );
    }
}
