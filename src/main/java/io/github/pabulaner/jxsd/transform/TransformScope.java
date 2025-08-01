package io.github.pabulaner.jxsd.transform;

import io.github.pabulaner.jxsd.java.JavaType;

import java.util.List;
import java.util.Map;

public record TransformScope(Map<JavaType, List<JavaType>> implementations) {
}
