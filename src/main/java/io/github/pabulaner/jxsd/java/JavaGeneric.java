package io.github.pabulaner.jxsd.java;

public class JavaGeneric {

    private final JavaType type;

    private final JavaType upper;

    private JavaGeneric(JavaType type, JavaType upper) {
        this.type = type;
        this.upper = upper;
    }

    public JavaType getType() {
        return type;
    }

    public JavaType getUpper() {
        return upper;
    }

    public static final class Builder {

        private JavaType type = null;

        private JavaType upper = null;

        public Builder() {
        }

        public Builder(JavaGeneric other) {
            this.type = other.getType();
            this.upper = other.getUpper();
        }

        public Builder setType(JavaType type) {
            this.type = type;
            return this;
        }

        public Builder setUpper(JavaType upper) {
            this.upper = upper;
            return this;
        }

        public JavaGeneric build() {
            return new JavaGeneric(type, upper);
        }
    }
}
