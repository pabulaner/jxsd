package io.github.pabulaner.jxsd.api.java;

public interface IJavaName {

    String base();

    String part();

    String valid();

    IJavaName clean();

    IJavaName lower();

    IJavaName upper();

    IJavaName withPrefix(String prefix);

    IJavaName withSuffix(String suffix);
}
