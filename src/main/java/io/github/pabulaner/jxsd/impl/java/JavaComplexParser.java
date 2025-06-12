package io.github.pabulaner.jxsd.impl.java;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.impl.xsd.XsdComplexStruct;
import io.github.pabulaner.jxsd.impl.xsd.XsdElementValue;
import io.github.pabulaner.jxsd.impl.xsd.XsdGroupValue;
import io.github.pabulaner.jxsd.impl.xsd.XsdScope;
import io.github.pabulaner.jxsd.impl.xsd.XsdType;
import io.github.pabulaner.jxsd.impl.xsd.XsdValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaComplexParser extends JavaParser<XsdComplexStruct> {

    private static final int MAX_NAME_COUNT = 3;

    private static final String SEQUENCE_SEPARATOR = "And";

    private static final String UNION_SEPARATOR = "Or";

    public JavaComplexParser(XsdScope scope) throws IOException {
        this("complex_sequence.ftl", scope);
    }

    private JavaComplexParser(String template, XsdScope scope) throws IOException {
        super(template, scope);
    }

    @Override
    protected void parse(XsdComplexStruct struct, Map<String, Object> data) {
        List<String> inners = new ArrayList<>();
        List<Map<String, String>> fields = new ArrayList<>();

        struct.values().forEach(value -> parseValue(value, inners, fields));

        data.put(NAME, JavaName.toClass(struct.type().name()));
        data.put(INNERS, inners);
        data.put(FIELDS, fields);
    }

    private void parseValue(XsdValue value, List<String> inners, List<Map<String, String>> fields) {
        switch (value) {
            case XsdElementValue casted -> parseElement(casted, fields);
            case XsdGroupValue casted -> parseGroup(casted, inners, fields);
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    private void parseElement(XsdElementValue value, List<Map<String, String>> fields) {
        String type = JavaName.toClass(value.type().name());
        String name = value.name();

        if (value.maxOccurs() > 1) {
            type = "List<" + type + ">";
        }

        fields.add(createField(type, JavaName.toVariable(name), JavaName.toUpper(name)));
    }

    private void parseGroup(XsdGroupValue value, List<String> inners, List<Map<String, String>> fields) {
        if (value.kind() == XsdGroupValue.Kind.UNION || value.maxOccurs() > 1) {
            String upperName = getUpperName(value);
            String type = upperName;
            System.out.println("type: " + type);

            if (value.maxOccurs() > 1) {
                type = "List<" + type + ">";
            }

            fields.add(createField(type, JavaName.toLower(upperName), upperName));

            XsdType xsdType = new XsdType(null, upperName, null, null);
            XsdComplexStruct xsdStruct = new XsdComplexStruct(xsdType, value.values());

            String template = value.kind() == XsdGroupValue.Kind.SEQUENCE
                    ? "complex_sequence.ftl"
                    : "complex_union.ftl";

            try {
                inners.add(new JavaComplexParser(template, getScope()).parse(xsdStruct));
            } catch (TemplateException | IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            value.values().forEach(val -> parseValue(val, inners, fields));
        }
    }

    private Map<String, String> createField(String type, String lowerName, String upperName) {
        Map<String, String> result = new HashMap<>();
        result.put("type", type);
        result.put("lowerName", lowerName);
        result.put("upperName", upperName);

        return result;
    }

    private String getUpperName(XsdGroupValue value) {
        return getUpperName(value, MAX_NAME_COUNT);
    }

    private String getUpperName(XsdGroupValue value, int maxNameCount) {
        List<XsdValue> values = value.values();
        StringBuilder result = new StringBuilder();

        String separator = value.kind() == XsdGroupValue.Kind.SEQUENCE
                ? SEQUENCE_SEPARATOR
                : UNION_SEPARATOR;

        for (int i = 0; i < maxNameCount && i < values.size(); i++) {
            String name = switch (values.get(i)) {
                case XsdElementValue casted -> JavaName.toUpper(casted.name());
                case XsdGroupValue casted -> getUpperName(casted, 1);
                default -> throw new IllegalStateException("Unexpected value: " + values.get(i));
            };

            if (!result.isEmpty()) {
                result.append(separator);
            }

            result.append(name);
        }

        return result.toString();
    }
}
