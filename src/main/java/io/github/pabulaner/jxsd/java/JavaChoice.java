package io.github.pabulaner.jxsd.java;

import java.util.List;

public record JavaChoice(JavaType type, List<JavaClass> inners, List<JavaField> fields) implements JavaComplex {
}
