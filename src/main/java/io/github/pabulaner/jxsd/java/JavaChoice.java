package io.github.pabulaner.jxsd.java;

import java.util.List;

public final class JavaChoice extends JavaComplex {

    private JavaChoice(JavaType type, List<JavaType> interfaces, List<JavaClass> inners, List<JavaField> fields) {
        super(type, interfaces, inners, fields);
    }

    @Override
    public Builder builder() {
        return new Builder(this);
    }

    public static final class Builder extends JavaComplex.Builder<Builder, JavaChoice> {

        public Builder() {
        }

        public Builder(JavaChoice other) {
            super(other);
        }

        public JavaChoice build() {
            return new JavaChoice(type, interfaces, inners, fields);
        }
    }
}
