package io.github.pabulaner.jxsd.java.parser;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public final class JavaHeader {

    private JavaHeader() {
        // empty
    }

    public static String toPackage(String scope) {
        if (scope == null) {
            return null;
        }

        try {
            URL url = URI.create(scope).toURL();
            String[] parts = url.getPath().split("/");

            for (int i = 0; i < parts.length; i++) {
                // check if parts[i] only contains digits
                if (parts[i].matches("\\d+")) {
                    parts[i] = "_" + parts[i];
                }
            }

            // remove first dot and return result
            return String.join(".", parts).substring(1);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
