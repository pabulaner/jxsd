package io.github.pabulaner.jxsd.api.java;

public interface IJavaName {

    String raw();

    String valid();

    String upper();

    String clean();

    IJavaName withPrefix(String prefix);

    IJavaName withSuffix(String suffix);
}
