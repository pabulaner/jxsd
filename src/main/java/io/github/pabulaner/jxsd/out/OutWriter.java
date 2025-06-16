package io.github.pabulaner.jxsd.out;

import io.github.pabulaner.jxsd.java.parser.JavaHeader;
import io.github.pabulaner.jxsd.java.parser.JavaResult;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OutWriter {

    public void write(Path path, JavaResult result) throws IOException {
        String pack = JavaHeader.toPackage(result.scope()).replace(".", "/");
        Path full = path.resolve(Path.of(pack)).resolve(result.name() + ".java");

        Files.createDirectories(path.resolve(Path.of(pack)));
        Files.writeString(full, result.content());
    }
}
