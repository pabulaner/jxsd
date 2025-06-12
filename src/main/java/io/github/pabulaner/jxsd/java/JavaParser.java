package io.github.pabulaner.jxsd.java;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.xsd.XsdScope;
import io.github.pabulaner.jxsd.xsd.XsdStruct;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class JavaParser<TStruct extends XsdStruct> {

    private static final List<String> TYPES = List.of("model");

    private final String type;

    private final Template template;

    private final XsdScope scope;

    public JavaParser(String type, String template, XsdScope scope) throws IOException {
        Configuration config = new Configuration(Configuration.VERSION_2_3_34);
        config.setClassForTemplateLoading(JavaStructParser.class, "/templates");

        this.type = type;
        this.template = config.getTemplate(type + "/" + template);
        this.scope = scope;
    }

    public JavaResult parse(TStruct struct) throws TemplateException, IOException {
        Map<String, Object> data = new HashMap<>();
        parse(struct, data);

        Writer writer = new StringWriter();
        template.process(data, writer);

        return new JavaResult(type, struct.type().scope(), writer.toString());
    }

    protected abstract void parse(TStruct struct, Map<String, Object> data);

    public String getType() {
        return type;
    }

    public XsdScope getScope() {
        return scope;
    }
}
