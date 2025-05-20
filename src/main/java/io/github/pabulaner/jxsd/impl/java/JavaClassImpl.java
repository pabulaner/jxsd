package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.api.java.IJavaClass;
import io.github.pabulaner.jxsd.api.java.IJavaField;
import io.github.pabulaner.jxsd.api.java.IJavaModel;
import io.github.pabulaner.jxsd.api.java.IJavaType;

import java.util.List;

public record JavaClassImpl(IJavaType type, List<IJavaField> fields, List<IJavaModel> inners) implements IJavaClass {
}
