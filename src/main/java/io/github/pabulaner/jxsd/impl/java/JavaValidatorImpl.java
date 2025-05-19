package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.api.java.IJavaValidator;

import java.util.Map;

public record JavaValidatorImpl(String name, Map<String, String> values) implements IJavaValidator {
}
