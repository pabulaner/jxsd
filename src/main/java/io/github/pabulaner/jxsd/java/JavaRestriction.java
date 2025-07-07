package io.github.pabulaner.jxsd.java;

import java.util.List;

public record JavaRestriction(JavaType type, JavaType parent, JavaType primitive, List<String> restrictions) implements JavaClass {

    @Override
    public JavaRestriction withType(JavaType type) {
        return new JavaRestriction(type, parent, primitive, restrictions);
    }
}
