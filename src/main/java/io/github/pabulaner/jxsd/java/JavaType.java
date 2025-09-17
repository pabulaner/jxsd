package io.github.pabulaner.jxsd.java;

import java.util.List;
import java.util.Objects;

public final class JavaType {

    private final List<String> pkg;

    private final List<String> outer;

    private final String name;

    private final int minOccurs;

    private final int maxOccurs;

    private JavaType(List<String> pkg, List<String> outer, String name, int minOccurs, int maxOccurs) {
        this.pkg = List.copyOf(pkg);
        this.outer = List.copyOf(outer);
        this.name = name;
        this.minOccurs = minOccurs;
        this.maxOccurs = maxOccurs;
    }

    public boolean isList() {
        return maxOccurs > 1;
    }

    public boolean isRequired() {
        return minOccurs >= 1;
    }

    public List<String> getPkg() {
        return pkg;
    }

    public List<String> getOuter() {
        return outer;
    }

    public String getName() {
        return name;
    }

    public int getMinOccurs() {
        return minOccurs;
    }

    public int getMaxOccurs() {
        return maxOccurs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkg, outer, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != JavaType.class) {
            return false;
        }

        JavaType casted = (JavaType) obj;

        return Objects.equals(casted.pkg, pkg)
                && Objects.equals(casted.outer, outer)
                && Objects.equals(casted.name, name);
    }

    public static final class Builder {

        private List<String> pkg = List.of();

        private List<String> outer = List.of();

        private String name = null;

        private int minOccurs = 1;

        private int maxOccurs = 1;

        public Builder() {
        }

        public Builder(JavaType other) {
            this.pkg = other.getPkg();
            this.outer = other.getOuter();
            this.name = other.getName();
            this.minOccurs = other.getMinOccurs();
            this.maxOccurs = other.getMaxOccurs();
        }

        public Builder setPkg(List<String> pkg) {
            this.pkg = pkg;
            return this;
        }

        public Builder setOuter(List<String> outer) {
            this.outer = outer;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMinOccurs(int minOccurs) {
            this.minOccurs = minOccurs;
            return this;
        }

        public Builder setMaxOccurs(int maxOccurs) {
            this.maxOccurs = maxOccurs;
            return this;
        }

        public JavaType build() {
            return new JavaType(pkg, outer, name, minOccurs, maxOccurs);
        }
    }
}
