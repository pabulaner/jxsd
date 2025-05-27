package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.api.java.IJavaName;

public record JavaNameImpl(String base, String part) implements IJavaName {

    @Override
    public String valid() {
        String clean = clean().valid();

        return switch (clean) {
            case "byte", "short", "int", "long", "float", "double", "boolean", "char", "if", "else", "for" -> "_" + clean;
            default -> clean;
        };
    }

    @Override
    public IJavaName lower() {
        String clean = clean().part();

        return new JavaNameImpl(base(), clean.isEmpty()
                ? clean
                : clean.substring(0, 1).toLowerCase() + clean.substring(1));
    }

    @Override
    public IJavaName upper() {
        String clean = clean().part();

        return new JavaNameImpl(base(), clean.isEmpty()
                ? clean
                : clean.substring(0, 1).toUpperCase() + clean.substring(1));
    }

    @Override
    public IJavaName clean() {
        int index = part.indexOf("_");

        return new JavaNameImpl(base(), index < 0
                ? part
                : part.substring(index + 1));
    }

    @Override
    public IJavaName withPrefix(String prefix) {
        return new JavaNameImpl(base, prefix + upper());
    }

    @Override
    public IJavaName withSuffix(String suffix) {
        IJavaName other = new JavaNameImpl(null, suffix);
        return new JavaNameImpl(base, part + other.upper());
    }
}
