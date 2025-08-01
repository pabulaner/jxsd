package io.github.pabulaner.jxsd.java;

import java.util.List;

public final class JavaRestriction extends JavaClass {

    private final JavaType parent;

    private final JavaType primitive;

    private final List<String> restrictions;


    private JavaRestriction(JavaType type, List<JavaType> interfaces, JavaType parent, JavaType primitive, List<String> restrictions) {
        super(type, interfaces);

        this.parent = parent;
        this.primitive = primitive;
        this.restrictions = List.copyOf(restrictions);
    }

    @Override
    public Builder builder() {
        return new Builder(this);
    }

    public JavaType getParent() {
        return parent;
    }

    public JavaType getPrimitive() {
        return primitive;
    }

    public List<String> getRestrictions() {
        return restrictions;
    }


    public static final class Builder extends JavaClass.Builder<Builder, JavaRestriction> {

        private JavaType parent = null;

        private JavaType primitive = null;

        private List<String> restrictions = List.of();

        public Builder() {
        }

        public Builder(JavaRestriction other) {
            super(other);

            this.parent = other.getParent();
            this.primitive = other.getPrimitive();
            this.restrictions = other.getRestrictions();
        }

        public Builder setParent(JavaType parent) {
            this.parent = parent;
            return this;
        }

        public Builder setPrimitive(JavaType primitive) {
            this.primitive = primitive;
            return this;
        }

        public Builder setRestrictions(List<String> restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        public JavaRestriction build() {
            return new JavaRestriction(type, interfaces, parent, primitive, restrictions);
        }
    }
}
