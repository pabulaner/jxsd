package io.github.pabulaner.jxsd.out;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaComplex;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaList;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.model.ModelParser;
import io.github.pabulaner.jxsd.out.model.ModelParserMap;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OutWriter {

    private final String MODEL_MODE = "model";

    private final JavaResult result;

    public OutWriter(JavaResult result) {
        this.result = result;
    }

    public void write(Path path, List<String> modes) throws TemplateException, IOException {
        modes = new ArrayList<>(modes);
        modes.add(MODEL_MODE);

        for (String mode : modes) {
            for (JavaClass clazz : result.classes()) {
                write(path, mode, clazz);
            }
        }
    }

    private void write(Path path, String mode, JavaClass clazz) throws IOException, TemplateException {
        ModelParserMap parser = new ModelParserMap();
        TypeSpec result = parser.parse(false, clazz);
        String pkg = OutParser.parsePkg(clazz.type().pkg());

        JavaFile.builder(pkg, result)
                .build()
                .writeTo(path);
    }
}
