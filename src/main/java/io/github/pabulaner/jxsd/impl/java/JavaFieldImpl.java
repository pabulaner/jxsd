package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.api.java.IJavaField;
import io.github.pabulaner.jxsd.api.java.IJavaName;
import io.github.pabulaner.jxsd.api.java.IJavaType;
import io.github.pabulaner.jxsd.api.java.IJavaValidator;

import java.util.List;

public record JavaFieldImpl(IJavaType type, IJavaName name, String value, List<IJavaValidator> validators) implements IJavaField {
}
