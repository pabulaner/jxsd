package io.github.pabulaner.jxsd.impl.java;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.api.xsd.IXsdModel;
import io.github.pabulaner.jxsd.api.xsd.IXsdSimpleType;
import io.github.pabulaner.jxsd.api.xsd.IXsdType;
import io.github.pabulaner.jxsd.impl.xsd.XsdResult;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaParser {

    private static final String SUFFIX = "model";

    private final Template primitiveTemplate;

    private final Template restrictionTemplate;

    private XsdResult xsdResult;

    public JavaParser() throws IOException {
        Configuration config = new Configuration(Configuration.VERSION_2_3_34);
        config.setClassForTemplateLoading(JavaParser.class, "/templates");

        primitiveTemplate = config.getTemplate("primitive.ftl");
        restrictionTemplate = config.getTemplate("restriction.ftl");
        xsdResult = null;
    }

    public void parse(XsdResult xsd) throws TemplateException, IOException {
        xsdResult = xsd;

        for (IXsdModel value : xsd.models()) {
            parse(value);
        }
    }

    private void parse(IXsdModel xsd) throws TemplateException, IOException {
        switch (xsd) {
            case IXsdSimpleType.IXsdPrimitiveType casted -> parsePrimitive(casted);
            case IXsdSimpleType.IXsdRestrictionType casted -> parseRestriction(casted);
            default -> {}
        }
    }

    private void parsePrimitive(IXsdSimpleType.IXsdPrimitiveType xsd) throws TemplateException, IOException {
        Map<String, Object> data = new HashMap<>();
        Writer result = new StringWriter();

        JavaName name = new JavaName(null, xsd.type().name()).withSuffix(SUFFIX);
        JavaName type = JavaName.getPrimitive(xsd.type());

        data.put("name", name.upper().part());
        data.put("type", type.part());

        primitiveTemplate.process(data, result);
        System.out.println(result);
    }

    private void parseRestriction(IXsdSimpleType.IXsdRestrictionType xsd) throws TemplateException, IOException {
        Map<String, String> data = new HashMap<>();
        Writer result = new StringWriter();

        data.put("name", xsd.type().name());
        data.put("type", xsdResult.getPrimitiveType(xsd.type()).name());

        restrictionTemplate.process(data, result);
        System.out.println(result);
    }
}
