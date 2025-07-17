package io.github.pabulaner.jxsd.out;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Writer {

    private final JavaResult result;

    public Writer(JavaResult result) {
        this.result = result;
    }

    public void write(Path path, List<ParserGroup> parsers) throws TemplateException, IOException {
        for (ParserGroup parser : parsers) {
            for (JavaClass clazz : result.classes()) {
                write(path, parser, clazz);
            }
        }
    }

    private void write(Path output, ParserGroup parser, JavaClass clazz) throws IOException, TemplateException {
        TypeSpec result = parser.parse(false, clazz);
        String pkg = Util.convertPkg(parser.getResolver().resolve(clazz.type()).pkg());

        JavaFile.builder(pkg, result)
                .build()
                .writeTo(output);
    }
}
