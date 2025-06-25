package io.github.pabulaner.jxsd.out;

import io.github.pabulaner.jxsd.java.JavaClass;

import java.util.Set;

public record OutFile(Set<String> imports, JavaClass content) {
}
