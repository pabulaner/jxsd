package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.impl.xsd.XsdComplexStruct;
import io.github.pabulaner.jxsd.impl.xsd.XsdElementValue;
import io.github.pabulaner.jxsd.impl.xsd.XsdGroupValue;
import io.github.pabulaner.jxsd.impl.xsd.XsdScope;
import io.github.pabulaner.jxsd.impl.xsd.XsdType;
import io.github.pabulaner.jxsd.impl.xsd.XsdValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JavaComplexParser extends JavaParser<XsdComplexStruct> {

    private static final int MAX_NAME_COUNT = 3;

    private static final String SEQUENCE_SEPARATOR = "And";

    private static final String UNION_SEPARATOR = "Or";

    private record Field(String type, String lowerName, String upperName) {
    }

    public JavaComplexParser(XsdScope scope) throws IOException {
        super("complex.ftl", scope);
    }

    @Override
    protected void parse(XsdComplexStruct struct, Map<String, Object> data) {
        struct.values().forEach(value -> parseValue(value, data));
        data.put(NAME, JavaName.toClass(struct.type().name()));
    }

    private void parseValue(XsdValue value, Map<String, Object> data) {
        List<String> inners = new ArrayList<>();
        List<Field> fields = new ArrayList<>();

        parseValue(value, inners, fields);

        data.put(INNERS, inners);
        data.put(FIELDS, fields);
    }

    private void parseValue(XsdValue value, List<String> inners, List<Field> fields) {
        switch (value) {
            case XsdElementValue casted -> parseElement(casted, fields);
            case XsdGroupValue casted -> parseGroup(casted, inners, fields);
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    private void parseElement(XsdElementValue value, List<Field> fields) {
        String type = JavaName.toClass(value.type().name());
        String name = value.name();

        if (value.maxOccurs() > 1) {
            type = "List<" + type + ">";
        }

        fields.add(new Field(type, JavaName.toVariable(name), JavaName.toUpper(name)));
    }

    private void parseGroup(XsdGroupValue value, List<String> inners, List<Field> fields) throws IOException {
        if (value.kind() == XsdGroupValue.Kind.UNION || value.maxOccurs() > 1) {
            String upperName = getUpperName(value);
            String type = upperName;

            if (value.maxOccurs() > 1) {
                type = "List<" + type + ">";
            }

            fields.add(new Field(type, JavaName.toLower(upperName), upperName));

            XsdType structType = new XsdType(null, upperName, null, null);
            XsdComplexStruct struct = new XsdComplexStruct(structType, )
            new JavaComplexParser(getScope()).parse()
        } else {
            value.values().forEach(val -> parseValue(val, inners, fields));
        }
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
