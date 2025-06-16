package io.github.pabulaner.jxsd.java.parser;

import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.xsd.XsdType;

import java.io.IOException;
import java.util.Map;

public class JavaPrimitiveParser extends JavaParser<XsdSimpleStruct.XsdPrimitiveStruct> {

    public record Test(String hello) {}

    public JavaPrimitiveParser(JavaParserConfig config) throws IOException {
        super(config.setTemplate("primitive.ftl"));
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdPrimitiveStruct struct, Map<String, Object> data) {
        String name = struct.type().name();
        XsdType type = toPrimitive(name);
        String scope = type.scope();

        data.put("test", new Test("whaaaat"));
        data.put(JavaTemplate.IMPORTS, null);
        data.put(JavaTemplate.NAME, name);
        data.put(JavaTemplate.TYPE, type.name());
    }

    public static XsdType toPrimitive(String type) {
        String name = switch (type) {
            case "string", "NOTATION", "QName", "anyURI", "IDREFS" -> "String";
            case "boolean" -> "Boolean";
            case "float" -> "Float";
            case "double" -> "Double";
            case "decimal" -> "Long";
            case "duration" -> "Duration";
            case "dateTime" -> "LocalDateTime";
            case "time" -> "LocalTime";
            case "date" -> "LocalDate";
            case "gYearMonth", "gMonth", "gDay", "gMonthDay", "gYear" -> "Integer";
            case "hexBinary", "base64Binary" -> "byte[]";
            default -> throw new IllegalArgumentException("Unexpected value: " + type);
        };

        String scope = switch (type) {
            case "duration", "dateTime", "time", "date" -> "java.time";
            default -> null;
        };

        return new XsdType(scope, name, null, null);
    }
}
