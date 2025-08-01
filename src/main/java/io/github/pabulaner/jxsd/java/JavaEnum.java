package io.github.pabulaner.jxsd.java;

import java.util.List;

public final class JavaEnum extends JavaClass {

    private final List<String> values;

    private JavaEnum(JavaType type, List<JavaType> interfaces, List<String> values) {
        super(type, interfaces);
        this.values = List.copyOf(values);
    }

    @Override
    public Builder builder() {
        return new Builder(this);
    }

    public List<String> getValues() {
        return values;
    }

    public static final class Builder extends JavaClass.Builder<Builder, JavaEnum> {

        private List<String> values = List.of();

        public Builder() {
        }

        public Builder(JavaEnum other) {
            super(other);
            this.values = other.getValues();
        }

        @Override
        public JavaEnum build() {
            return new JavaEnum(type, interfaces, values);
        }

        public Builder setValues(List<String> values) {
            this.values = values;
            return this;
        }
    }
}
