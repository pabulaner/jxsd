package io.github.pabulaner.jxsd.out;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.parser.ParserMap;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Writer {

    private final List<JavaClass> result;

    public Writer(List<JavaClass> result) {
        this.result = result;
    }

    public void write(Path path, ParserMap map) throws IOException {
        IOException[] exception = { null };

        map.parse(result, (type, result) -> {
            // TODO: figure out nice way for this
            if (type.name().endsWith("SystemColorValConverter")) {
                return;
            }

            try {
                write(path, type, result);
            } catch (IOException e) {
                exception[0] = e;
            }
        });

        if (exception[0] != null) {
            throw exception[0];
        }
    }

    private void write(Path path, JavaType type, TypeSpec result) throws IOException {
        JavaFile.builder(ParserUtil.convertPkg(type.pkg()), result)
                .build()
                .writeTo(path);
    }
}
