package io.github.pabulaner.jxsd.out;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaFile;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.EnumMap;
import java.util.Map;

public class OutWriter {

    private final Map<JavaFile.Type, String> types;

    public OutWriter() {
        types = new EnumMap<>(JavaFile.Type.class);
        types.put(JavaFile.Type.PRIMITIVE, "primitive.ftl");
        types.put(JavaFile.Type.RESTRICTION, "restriction.ftl");
        types.put(JavaFile.Type.LIST, "list.ftl");
        types.put(JavaFile.Type.UNION, "union.ftl");
        types.put(JavaFile.Type.ENUM, "enum.ftl");
    }

    public void write(String mode, JavaFile file) throws IOException, TemplateException {
        Configuration config = new Configuration(Configuration.VERSION_2_3_34);
        config.setClassForTemplateLoading(OutWriter.class, "/templates");

        Writer writer = new StringWriter();
        String directory = "generated/" + file.content().type().pkg().replace(".", "/");

        Template template = config.getTemplate(mode + "/" + types.get(file.type()));
        template.process(file, writer);

        Files.createDirectories(Path.of(directory));
        Files.writeString(Path.of(directory, file.content().type().toModel() + ".java"), writer.toString());
    }
}
