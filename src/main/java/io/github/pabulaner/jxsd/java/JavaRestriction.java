package io.github.pabulaner.jxsd.java;

import java.util.List;

public record JavaRestriction(JavaType type, JavaType parent, JavaType primitive, List<String> restrictions) implements JavaClass {
}
