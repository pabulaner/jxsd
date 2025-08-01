package io.github.pabulaner.jxsd.java;

public final class JavaMethod {

    private final String name;

    private final JavaType type;

    private final boolean isGeneric;

    private JavaMethod(String name, JavaType type, boolean isGeneric) {
        this.name = name;
        this.type = type;
        this.isGeneric = isGeneric;
    }

    public String getName() {
        return name;
    }

    public JavaType getType() {
        return type;
    }

    public boolean isGeneric() {
        return isGeneric;
    }

    public static final class Builder {

        private String name = null;

        private JavaType type = null;

        private boolean isGeneric = false;

        public Builder() {
        }

        public Builder(JavaMethod other) {
            this.name = other.getName();
            this.type = other.getType();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(JavaType type) {
            this.type = type;
            return this;
        }

        public Builder setIsGeneric(boolean isGeneric) {
            this.isGeneric = isGeneric;
            return this;
        }

        public JavaMethod build() {
            return new JavaMethod(name, type, isGeneric);
        }
    }
}
