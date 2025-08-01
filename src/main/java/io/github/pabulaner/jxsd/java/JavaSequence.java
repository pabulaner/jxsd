package io.github.pabulaner.jxsd.java;

import java.util.List;

public final class JavaSequence extends JavaComplex {

    private JavaSequence(JavaType type, List<JavaType> interfaces, List<JavaClass> inners, List<JavaField> fields) {
        super(type, interfaces, inners, fields);
    }

    @Override
    public Builder builder() {
        return new Builder(this);
    }

    public static final class Builder extends JavaComplex.Builder<Builder, JavaSequence> {

        public Builder() {
        }

        public Builder(JavaSequence other) {
            super(other);
        }

        public JavaSequence build() {
            return new JavaSequence(type, interfaces, inners, fields);
        }
    }
}

