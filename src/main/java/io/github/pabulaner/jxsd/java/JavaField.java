package io.github.pabulaner.jxsd.java;

public final class JavaField {

    private final JavaType type;

    private final String name;

    private JavaField(JavaType type, String name) {
        this.type = type;
        this.name = name;
    }

    public JavaType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static final class Builder {

        private JavaType type = null;

        private String name = null;

        public Builder() {
        }

        public Builder(JavaField other) {
            this.type = other.getType();
            this.name = other.getName();
        }

        public Builder setType(JavaType type) {
            this.type = type;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public JavaField build() {
            return new JavaField(type, name);
        }
    }
}
