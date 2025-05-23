package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.api.java.IJavaName;
import io.github.pabulaner.jxsd.api.java.IJavaType;

public record JavaTypeImpl(IJavaName name, IJavaName parent, Kind kind) implements IJavaType {
}
