package io.github.pabulaner.jxsd.transform;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaType;

public final class TransformUtil {

    private TransformUtil() {
        // empty
    }

    @SuppressWarnings("unchecked")
    public static <TClass extends JavaClass> TClass withType(TClass clazz, JavaType type) {
        return (TClass) switch (clazz) {
            case JavaPrimitive casted -> new JavaPrimitive(type, casted.primitive());
            default -> throw new IllegalStateException("Unexpected value: " + clazz);
        };
    }
}
