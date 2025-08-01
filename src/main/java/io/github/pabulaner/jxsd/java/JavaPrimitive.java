package io.github.pabulaner.jxsd.java;

import java.util.List;

public final class JavaPrimitive extends JavaClass {

    private JavaPrimitive(JavaType type, List<JavaType> interfaces) {
        super(type, interfaces);
    }

    @Override
    public Builder builder() {
        return new Builder(this);
    }

    public static final class Builder extends JavaClass.Builder<Builder, JavaPrimitive> {

        public Builder() {
        }

        public Builder(JavaPrimitive other) {
            super(other);
        }

        public JavaPrimitive build() {
            return new JavaPrimitive(type, interfaces);
        }
    }
}
