package io.github.pabulaner.jxsd.util;

public final class StringUtil {

    private StringUtil() {
        // empty
    }

    public static String toUpper(String value) {
        if (value == null) {
            return null;
        }

        return value.isEmpty()
                ? value
                : value.substring(0, 1).toUpperCase() + value.substring(1);
    }
}
