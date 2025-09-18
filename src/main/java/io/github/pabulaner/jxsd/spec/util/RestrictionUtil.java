package io.github.pabulaner.jxsd.spec.util;

import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaType;

public final class RestrictionUtil {
    
    private RestrictionUtil() {
        // empty
    }
    
    public static JavaType findPrimitive(JavaScope scope, JavaType type) {
        String primitive = type.getName();

        if (ParserUtil.PRIMITIVE_MAP.get(primitive) == null) {
            JavaRestriction restriction = (JavaRestriction) scope.get(type);
            return findPrimitive(scope, restriction.getParent());
        }

        return type;
    }
}
