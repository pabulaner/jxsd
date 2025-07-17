package io.github.pabulaner.jxsd.out;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;
import io.github.pabulaner.jxsd.out.parser.ParserMap;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

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
        JavaFile.builder(Util.convertPkg(type.pkg()), result)
                .build()
                .writeTo(output);
    }
}
