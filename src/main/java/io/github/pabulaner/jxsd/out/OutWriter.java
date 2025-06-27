package io.github.pabulaner.jxsd.out;

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
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.java.JavaUnion;

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

    private final Map<Class<? extends JavaClass>, String> types;

    private final JavaResult result;

    private final Set<String> imports;

    public OutWriter(JavaResult result, Set<String> additionalImports) {
        this.types = new HashMap<>();
        this.result = result;
        this.imports = new HashSet<>();

        types.put(JavaPrimitive.class, "primitive.ftl");
        types.put(JavaRestriction.class, "restriction.ftl");
        types.put(JavaList.class, "list.ftl");
        types.put(JavaUnion.class, "union.ftl");
        types.put(JavaEnum.class, "enum.ftl");
        types.put(JavaSequence.class, "sequence.ftl");
        types.put(JavaChoice.class, "choice.ftl");

        result.classes().forEach(clazz -> imports.add(clazz.type().pkg() + ".*"));
        imports.addAll(additionalImports);
    }

    public void write(List<String> modes) throws TemplateException, IOException {
        modes = new ArrayList<>(modes);
        modes.add(MODEL_MODE);

        for (String mode : modes) {
            for (JavaClass clazz : result.classes()) {
                write(mode, clazz);
            }
        }
    }

    private void write(String mode, JavaClass clazz) throws IOException, TemplateException {
        Configuration config = new Configuration(Configuration.VERSION_2_3_34);
        config.setClassForTemplateLoading(OutWriter.class, "/templates");

        Writer writer = new StringWriter();
        String directory = "src/main/java/" + String.join(".", clazz.type().pkg());

        Template template = config.getTemplate(mode + "/" + types.get(clazz.getClass()));
        template.process(new OutFile(addInnerImports(clazz, clazz.type().pkg(), new HashSet<>(imports)), result.scope(), clazz), writer);

        String content = new OutFormatter(writer.toString()).format();

        Files.createDirectories(Path.of(directory));
        Files.writeString(Path.of(directory, clazz.type().clean(toUpper(mode), false) + ".java"), content);
    }

    // TODO: figure out nice way to deal with inner classes that are used in other classes
    private Set<String> addInnerImports(JavaClass clazz, List<String> base, Set<String> imports) {
        base = new ArrayList<>(base);
        base.add(clazz.type().toModel());

        if (clazz instanceof JavaComplex casted) {
            for (JavaClass inner : casted.inners()) {
                addInnerImports(inner, base, imports);
            }
        }

        imports.add(String.join(".", base) + ".*");
        return imports;
    }

    private String toUpper(String mode) {
        return mode.substring(0, 1).toUpperCase() + mode.substring(1);
    }
}
