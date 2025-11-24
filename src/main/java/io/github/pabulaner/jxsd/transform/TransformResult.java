package io.github.pabulaner.jxsd.transform;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaScope;

import java.util.List;

public record TransformResult(JavaScope scope, List<JavaClass> classes, TransformMap map) {
}
