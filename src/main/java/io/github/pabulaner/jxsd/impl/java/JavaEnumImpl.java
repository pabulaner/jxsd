package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.api.java.IJavaEnum;
import io.github.pabulaner.jxsd.api.java.IJavaType;

import java.util.List;

public record JavaEnumImpl(IJavaType type, List<String> values) implements IJavaEnum {
}
