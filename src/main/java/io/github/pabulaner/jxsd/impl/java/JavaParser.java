package io.github.pabulaner.jxsd.impl.java;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.impl.xsd.XsdScope;
import io.github.pabulaner.jxsd.impl.xsd.XsdStruct;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public abstract class JavaParser<TStruct extends XsdStruct> {

    private static final String CLASS_SUFFIX = "model";

    protected static final String NAME = "name";

    protected static final String TYPE = "type";

    protected static final String TYPES = "types";

    protected static final String PARENT = "parent";

    protected static final String RESTRICTIONS = "restrictions";

    private final Template template;

    private final XsdScope scope;

    public JavaParser(String template, XsdScope scope) throws IOException {
        Configuration config = new Configuration(Configuration.VERSION_2_3_34);
        config.setClassForTemplateLoading(JavaStructParser.class, "/templates");

        this.template = config.getTemplate(template);
        this.scope = scope;
    }

    public void parse(TStruct struct) throws TemplateException, IOException {
        Map<String, Object> data = new HashMap<>();
        Writer result = new StringWriter();

        parse(struct, data);

        template.process(data, result);
        System.out.println(result);
    }

    protected abstract void parse(TStruct struct, Map<String, Object> data);

    public XsdScope getScope() {
        return scope;
    }
}
