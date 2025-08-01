package io.github.pabulaner.jxsd.java;

import java.util.List;

public abstract class JavaComplex extends JavaClass {

    private final List<JavaClass> inners;

    private final List<JavaField> fields;

    protected JavaComplex(JavaType type, List<JavaType> interfaces, List<JavaClass> inners, List<JavaField> fields) {
        super(type, interfaces);

        this.inners = inners;
        this.fields = fields;
    }

    public abstract Builder<?, ?> builder();

    public List<JavaClass> getInners() {
        return inners;
    }

    public List<JavaField> getFields() {
        return fields;
    }

    public static abstract class Builder<TBuilder extends Builder<TBuilder, TClass>, TClass extends JavaComplex> extends JavaClass.Builder<TBuilder, TClass> {

        protected List<JavaClass> inners = List.of();

        protected List<JavaField> fields = List.of();

        public Builder() {
        }

        public Builder(TClass other) {
            super(other);

            inners = other.getInners();
            fields = other.getFields();
        }

        public TBuilder setInners(List<JavaClass> inners) {
            this.inners = inners;
            return self();
        }

        public TBuilder setFields(List<JavaField> fields) {
            this.fields = fields;
            return self();
        }
    }
}
