package io.github.pabulaner.jxsd.out;

import io.github.pabulaner.jxsd.java.JavaResult;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OutWriter {

    public void write(Path path, JavaResult result) throws IOException {
        String pack = getPackage(result.scope());
        Path full = path.resolve(Path.of(pack)).resolve(result.type() + ".java");

        Files.createDirectories(path.resolve(Path.of(pack)));
        Files.writeString(full, result.content());
    }

    private String getPackage(String scope) {
        try {
            URL url = URI.create(scope).toURL();
            String[] parts = url.getPath().split("/");

            for (int i = 0; i < parts.length; i++) {
                // check if parts[i] only contains digits
                if (parts[i].matches("\\d+")) {
                    parts[i] = "_" + parts[i];
                }
            }

            return String.join(".", parts).substring(1);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
