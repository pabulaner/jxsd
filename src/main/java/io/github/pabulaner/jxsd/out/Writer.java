package io.github.pabulaner.jxsd.out;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.parser.ParserMap;

import java.io.IOException;
import java.nio.file.Path;

public class Writer {

    private final JavaResult result;

    public Writer(JavaResult result) {
        this.result = result;
    }

    public void write(Path path, ParserMap map) throws IOException {
        IOException[] exception = { null };

        map.parse(result.classes(), (resolver, result) -> {
            try {
                write(path, resolver, result);
            } catch (IOException e) {
                exception[0] = e;
            }
        });

        if (exception[0] != null) {
            throw exception[0];
        }
    }

    private void write(Path output, JavaType type, TypeSpec result) throws IOException {
        JavaFile.builder(ParserUtil.convertPkg(type.pkg()), result)
                .build()
                .writeTo(output);
    }
}
