package io.github.pabulaner.jxsd.java.parser;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.xsd.XsdStruct;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public abstract class JavaParser<TStruct extends XsdStruct> {

    private final JavaParserConfig config;

    private final Template template;

    public JavaParser(JavaParserConfig config) throws IOException {
        Configuration templateConfig = new Configuration(Configuration.VERSION_2_3_34);
        templateConfig.setClassForTemplateLoading(JavaStructParser.class, "/templates");

        this.config = config;
        this.template = templateConfig.getTemplate(config.getType() + "/" + config.getTemplate());
    }

    public JavaResult parse(TStruct struct) throws TemplateException, IOException {
        Map<String, Object> data = new HashMap<>();
        parse(struct, data);

        data.put(JavaTemplate.PACKAGE, JavaHeader.toPackage(struct.type().scope()));

        Writer writer = new StringWriter();
        template.process(data, writer);

        return new JavaResult(struct.type().scope(), struct.type().name(), writer.toString());
    }

    protected abstract void parse(TStruct struct, Map<String, Object> data);

    public JavaParserConfig getConfig() {
        return config;
    }
}
