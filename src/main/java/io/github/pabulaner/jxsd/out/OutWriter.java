package io.github.pabulaner.jxsd.out;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class OutWriter {

    private final JavaResult result;

    public OutWriter(JavaResult result) {
        this.result = result;
    }

    public void write(Path path, List<OutParserMap> parsers) throws TemplateException, IOException {
        for (OutParserMap parser : parsers) {
            for (JavaClass clazz : result.classes()) {
                write(path, parser, clazz);
            }
        }
    }

    private void write(Path output, OutParserMap parser, JavaClass clazz) throws IOException, TemplateException {
        TypeSpec result = parser.parse(false, clazz);
        String pkg = OutParser.parsePkg(parser.getResolver().type(clazz.type()).pkg());

        JavaFile.builder(pkg, result)
                .build()
                .writeTo(output);
    }
}
