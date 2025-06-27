package io.github.pabulaner.jxsd.out;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaScope;

import java.util.Set;

public record OutFile(Set<String> imports, JavaScope scope, JavaClass content) {
}
