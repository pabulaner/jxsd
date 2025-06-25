package io.github.pabulaner.jxsd.out;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaFile;
import io.github.pabulaner.jxsd.java.JavaList;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import org.docx4j.dml.chart.CTAxDataSource;
import org.docx4j.dml.diagram.STAxisType;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class OutWriter {

    private final Map<Class<? extends JavaClass>, String> types;

    public OutWriter() {
        types = new HashMap<>();
        types.put(JavaPrimitive.class, "primitive.ftl");
        types.put(JavaRestriction.class, "restriction.ftl");
        types.put(JavaList.class, "list.ftl");
        types.put(JavaUnion.class, "union.ftl");
        types.put(JavaEnum.class, "enum.ftl");
        types.put(JavaSequence.class, "sequence.ftl");
        types.put(JavaChoice.class, "choice.ftl");
    }

    public void write(String mode, JavaFile file) throws IOException, TemplateException {
        Configuration config = new Configuration(Configuration.VERSION_2_3_34);
        config.setClassForTemplateLoading(OutWriter.class, "/templates");

        Writer writer = new StringWriter();
        String directory = "generated/" + file.content().type().pkg().replace(".", "/");

        Template template = config.getTemplate(mode + "/" + types.get(file.content().getClass()));
        template.process(file, writer);

        String content = new OutFormatter(writer.toString()).format();

        Files.createDirectories(Path.of(directory));
        Files.writeString(Path.of(directory, file.content().type().clean(toUpper(mode), false) + ".java"), content);
    }

    private String toUpper(String mode) {
        return mode.substring(0, 1).toUpperCase() + mode.substring(1);
    }
}
