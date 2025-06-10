package io.github.pabulaner.jxsd.impl.java;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.impl.xsd.XsdResult;
import io.github.pabulaner.jxsd.impl.xsd.XsdScope;
import io.github.pabulaner.jxsd.impl.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.impl.xsd.XsdStruct;
import io.github.pabulaner.jxsd.impl.xsd.XsdType;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class JavaStructParser {

    private static final String SUFFIX = "model";

    private final Template primitiveTemplate;

    private final Template restrictionTemplate;

    private XsdScope scope;

    public JavaStructParser() throws IOException {
        Configuration config = new Configuration(Configuration.VERSION_2_3_34);
        config.setClassForTemplateLoading(JavaStructParser.class, "/templates");

        primitiveTemplate = config.getTemplate("primitive.ftl");
        restrictionTemplate = config.getTemplate("restriction.ftl");
        scope = null;
    }

    public void parse(XsdResult xsd) throws TemplateException, IOException {
        scope = xsd.scope();

        for (XsdStruct value : xsd.structs()) {
            parse(value);
        }
    }

    private void parse(XsdStruct xsd) throws TemplateException, IOException {
        switch (xsd) {
            case XsdSimpleStruct.XsdPrimitiveStruct casted -> parsePrimitive(casted);
            case XsdSimpleStruct.XsdRestrictionStruct casted -> parseRestriction(casted);
            default -> {}
        }
    }

    private void parsePrimitive(XsdSimpleStruct.XsdPrimitiveStruct xsd) throws TemplateException, IOException {
        Map<String, Object> data = new HashMap<>();
        Writer result = new StringWriter();

        JavaName name = new JavaName(null, xsd.type().name()).withSuffix(SUFFIX);
        JavaName type = JavaName.getPrimitive(xsd.type());

        data.put("name", name.upper().part());
        data.put("type", type.part());

        primitiveTemplate.process(data, result);
        System.out.println(result);
    }

    private void parseRestriction(XsdSimpleStruct.XsdRestrictionStruct xsd) throws TemplateException, IOException {
        Map<String, String> data = new HashMap<>();
        Writer result = new StringWriter();



        restrictionTemplate.process(data, result);
        System.out.println(result);
    }
}
