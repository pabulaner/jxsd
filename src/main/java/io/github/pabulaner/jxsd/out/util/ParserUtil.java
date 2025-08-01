package io.github.pabulaner.jxsd.out.util;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.resolver.Resolver;
import io.github.pabulaner.jxsd.util.Name;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

public final class ParserUtil {

    public static final Map<String, String> PRIMITIVE_MAP = new HashMap<>();

    static {
        PRIMITIVE_MAP.put("anyURI", "String");
        PRIMITIVE_MAP.put("base64Binary", "String");
        PRIMITIVE_MAP.put("boolean", "boolean");
        PRIMITIVE_MAP.put("byte", "byte");
        PRIMITIVE_MAP.put("date", "LocalDate");
        PRIMITIVE_MAP.put("dateTime", "LocalDateTime");
        PRIMITIVE_MAP.put("decimal", "long");
        PRIMITIVE_MAP.put("double", "double");
        PRIMITIVE_MAP.put("duration", "Duration");
        PRIMITIVE_MAP.put("float", "float");
        PRIMITIVE_MAP.put("gDay", "int");
        PRIMITIVE_MAP.put("gMonth", "int");
        PRIMITIVE_MAP.put("gMonthDay", "int");
        PRIMITIVE_MAP.put("gYear", "int");
        PRIMITIVE_MAP.put("gYearMonth", "int");
        PRIMITIVE_MAP.put("hexBinary", "String");
        PRIMITIVE_MAP.put("IDREFS", "String");
        PRIMITIVE_MAP.put("int", "int");
        PRIMITIVE_MAP.put("long", "long");
        PRIMITIVE_MAP.put("NOTATION", "String");
        PRIMITIVE_MAP.put("QName", "String");
        PRIMITIVE_MAP.put("short", "short");
        PRIMITIVE_MAP.put("string", "String");
        PRIMITIVE_MAP.put("time", "LocalTime");
        PRIMITIVE_MAP.put("unsignedByte", "short");
        PRIMITIVE_MAP.put("unsignedLong", "long");
        PRIMITIVE_MAP.put("unsignedShort", "int");
    }

    private ParserUtil() {
        // empty
    }

    public static String convertPkg(List<String> pkg) {
        return String.join(".", pkg);
    }

    public static TypeName convertPrimitive(JavaType type) {
        return convertPrimitive(type, false);
    }

    public static TypeName convertPrimitive(JavaType type, boolean wrapper) {
        String primitive = type.getName();

        String pkg = switch (primitive) {
            case "duration", "dateTime", "time", "date" -> "java.time";
            default -> "";
        };

        String name = PRIMITIVE_MAP.get(primitive);

        if (wrapper) {
            name = name.equals("int")
                    ? "Integer"
                    : new Name(name).toUpper();
        }

        return ClassName.get(pkg, name);
    }

    public static TypeName convertType(JavaType type, Resolver resolver) {
        return convertType(type, resolver, type.isList());
    }

    public static TypeName convertType(JavaType type, Resolver resolver, boolean isList) {
        type = resolver.resolve(type);
        Queue<String> all = new LinkedList<>(type.getOuter());

        all.add(type.getName());
        ClassName result = ClassName.get(convertPkg(type.getPkg()), all.remove());

        while (!all.isEmpty()) {
            result = result.nestedClass(all.remove());
        }

        if (isList) {
            ClassName list = ClassName.get(List.class);
            return ParameterizedTypeName.get(list, result);
        } else {
            return result;
        }
    }

    public static String convertMethodName(String... parts) {
        boolean[] first = { true };
        return Arrays.stream(parts)
                .map(part -> {
                    if (first[0]) {
                        first[0] = false;
                        return new Name(part).toLower();
                    } else {
                        return new Name(part).toUpper();
                    }
                })
                .collect(Collectors.joining());
    }

    public static String convertGetterName(JavaType type, String name) {
        String typeName = type.getName();
        String prefix = typeName.equals("boolean")
                ? "is"
                : "get";

        System.out.println(type.getName());

        return prefix + new Name(name).toVarUpper();
    }
}
