package io.github.pabulaner.jxsd.java;

import java.util.List;

public final class JavaInterface extends JavaClass {

    private final List<JavaGeneric> generics;

    private final List<JavaMethod> methods;

    private JavaInterface(JavaType type, List<JavaType> interfaces, List<JavaGeneric> generics, List<JavaMethod> methods) {
        super(type, interfaces);

        this.generics = generics;
        this.methods = methods;
    }

    @Override
    public Builder builder() {
        return new Builder(this);
    }

    public List<JavaGeneric> getGenerics() {
        return generics;
    }

    public List<JavaMethod> getMethods() {
        return methods;
    }

    public static final class Builder extends JavaClass.Builder<Builder, JavaInterface> {

        private List<JavaGeneric> generics = List.of();

        private List<JavaMethod> methods = List.of();

        public Builder() {
        }

        public Builder(JavaInterface other) {
            super(other);

            generics = other.getGenerics();
            methods = other.getMethods();
        }

        public Builder setGenerics(List<JavaGeneric> generics) {
            this.generics = generics;
            return this;
        }

        public Builder setMethods(List<JavaMethod> methods) {
            this.methods = methods;
            return this;
        }

        @Override
        public JavaInterface build() {
            return new JavaInterface(type, interfaces, generics, methods);
        }
    }

}
