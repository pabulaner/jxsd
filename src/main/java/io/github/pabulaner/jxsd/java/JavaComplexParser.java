package io.github.pabulaner.jxsd.java;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.xsd.XsdComplexStruct;
import io.github.pabulaner.jxsd.xsd.XsdElementValue;
import io.github.pabulaner.jxsd.xsd.XsdGroupValue;
import io.github.pabulaner.jxsd.xsd.XsdScope;
import io.github.pabulaner.jxsd.xsd.XsdType;
import io.github.pabulaner.jxsd.xsd.XsdValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaComplexParser extends JavaParser<XsdComplexStruct> {

    private static final int MAX_NAME_COUNT = 3;

    private static final String SEQUENCE_SEPARATOR = "And";

    private static final String UNION_SEPARATOR = "Or";

    public JavaComplexParser(String type, XsdScope scope) throws IOException {
        this(type, "complex_sequence.ftl", scope);
    }

    private JavaComplexParser(String type, String template, XsdScope scope) throws IOException {
        super(type, template, scope);
    }

    @Override
    protected void parse(XsdComplexStruct struct, Map<String, Object> data) {
        List<String> inners = new ArrayList<>();
        List<Map<String, Object>> fields = new ArrayList<>();

        struct.values().forEach(value -> parseValue(value, inners, fields));

        data.put(JavaTemplate.NAME, struct.type().name());
        data.put(JavaTemplate.INNERS, inners);
        data.put(JavaTemplate.FIELDS, fields);
    }

    private void parseValue(XsdValue value, List<String> inners, List<Map<String, Object>> fields) {
        switch (value) {
            case XsdElementValue casted -> parseElement(casted, fields);
            case XsdGroupValue casted -> parseGroup(casted, inners, fields);
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    private void parseElement(XsdElementValue value, List<Map<String, Object>> fields) {
        String type = value.type().name();
        String name = value.name();

        fields.add(createField(type, value.maxOccurs() > 1, name));
    }

    private void parseGroup(XsdGroupValue value, List<String> inners, List<Map<String, Object>> fields) {
        if (value.kind() == XsdGroupValue.Kind.UNION || value.maxOccurs() > 1) {
            String name = getName(value);

            fields.add(createField(name, value.maxOccurs() > 1, name));

            XsdType xsdType = new XsdType(null, name, null, null);
            XsdComplexStruct xsdStruct = new XsdComplexStruct(xsdType, value.values());

            String template = value.kind() == XsdGroupValue.Kind.SEQUENCE
                    ? "complex_sequence.ftl"
                    : "complex_union.ftl";

            try {
                JavaComplexParser parser = new JavaComplexParser(getType(), template, getScope());
                inners.add(parser.parse(xsdStruct).content());
            } catch (TemplateException | IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            value.values().forEach(val -> parseValue(val, inners, fields));
        }
    }

    private Map<String, Object> createField(String type, boolean isList, String name) {
        Map<String, Object> result = new HashMap<>();
        result.put("type", type);
        result.put("is_list", isList);
        result.put("name", name);

        return result;
    }

    private String getName(XsdGroupValue value) {
        return getName(value, MAX_NAME_COUNT);
    }

    private String getName(XsdGroupValue value, int maxNameCount) {
        List<XsdValue> values = value.values();
        StringBuilder result = new StringBuilder();

        String separator = value.kind() == XsdGroupValue.Kind.SEQUENCE
                ? SEQUENCE_SEPARATOR
                : UNION_SEPARATOR;

        for (int i = 0; i < maxNameCount && i < values.size(); i++) {
            String name = switch (values.get(i)) {
                case XsdElementValue casted -> casted.name();
                case XsdGroupValue casted -> getName(casted, 1);
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
