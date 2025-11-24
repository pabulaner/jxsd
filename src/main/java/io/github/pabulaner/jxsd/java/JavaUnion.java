package io.github.pabulaner.jxsd.java;

import java.util.List;

public final class JavaUnion extends JavaClass {

    private final List<JavaType> types;

    private JavaUnion(JavaType type, List<JavaType> interfaces, List<JavaType> types) {
        super(type, interfaces);
        this.types = List.copyOf(types);
    }

    @Override
    public Builder builder() {
        return new Builder(this);
    }

    public List<JavaType> getTypes() {
        return types;
    }

    public static final class Builder extends JavaClass.Builder<Builder, JavaUnion> {

        private List<JavaType> types = List.of();

        public Builder() {
        }

        public Builder(JavaUnion other) {
            super(other);
            this.types = other.getTypes();
        }

        public Builder setTypes(List<JavaType> types) {
            this.types = types;
            return this;
        }

        public JavaUnion build() {
            return new JavaUnion(type, interfaces, types);
        }
    }
}
