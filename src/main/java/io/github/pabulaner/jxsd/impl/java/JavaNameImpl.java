package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.api.java.IJavaName;

public record JavaNameImpl(String value) implements IJavaName {

    @Override
    public String raw() {
        return value;
    }

    @Override
    public String valid() {
        String clean = clean();

        return switch (clean) {
            case "byte", "short", "int", "long", "float", "double", "boolean", "char", "if", "else", "for" -> "_" + clean;
            default -> clean;
        };
    }

    @Override
    public String upper() {
        String clean = clean();

        return clean.isEmpty()
                ? clean
                : clean.substring(0, 1).toUpperCase() + clean.substring(1);
    }

    @Override
    public String clean() {
        int index = value.indexOf("_");

        return index < 0
                ? value
                : value.substring(index + 1);
    }

    @Override
    public IJavaName withPrefix(String prefix) {
        return new JavaNameImpl(prefix + upper());
    }

    @Override
    public IJavaName withSuffix(String suffix) {
        IJavaName other = new JavaNameImpl(suffix);
        return new JavaNameImpl(value + other.upper());
    }
}
