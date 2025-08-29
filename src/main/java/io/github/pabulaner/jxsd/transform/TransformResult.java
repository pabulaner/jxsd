package io.github.pabulaner.jxsd.transform;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaType;

import java.util.List;
import java.util.Map;

public record TransformResult(JavaScope scope, List<JavaClass> classes, TransformMap map) {
}
