package io.github.pabulaner.jxsd.java;

import java.util.List;

public abstract class JavaClass {

    private final JavaType type;

    private final List<JavaType> interfaces;

    protected JavaClass(JavaType type, List<JavaType> interfaces) {
        this.type = type;
        this.interfaces = List.copyOf(interfaces);
    }

    public abstract Builder<?, ?> builder();

    public JavaType getType() {
        return type;
    }

    public List<JavaType> getInterfaces() {
        return interfaces;
    }

    public static abstract class Builder<TBuilder extends Builder<TBuilder, TClass>, TClass extends JavaClass> {

        protected JavaType type = null;

        protected List<JavaType> interfaces = List.of();

        public Builder() {
        }

        public Builder(TClass other) {
            type = other.getType();
            interfaces = other.getInterfaces();
        }

        public TBuilder setType(JavaType type) {
            this.type = type;
            return self();
        }

        public TBuilder setInterfaces(List<JavaType> interfaces) {
            this.interfaces = interfaces;
            return self();
        }

        public abstract TClass build();

        @SuppressWarnings("unchecked")
        protected TBuilder self() {
            return (TBuilder) this;
        }
    }
}
