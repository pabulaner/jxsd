package io.github.pabulaner.jxsd.java;

public final class JavaField {

    private final JavaType type;

    private final String name;

    private final String value;

    private JavaField(JavaType type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public JavaType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public static final class Builder {

        private JavaType type = null;

        private String name = null;

        private String value = null;

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

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public JavaField build() {
            return new JavaField(type, name, value);
        }
    }
}
