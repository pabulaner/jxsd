package io.github.pabulaner.jxsd.out;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public final class ParserUtil {

    private ParserUtil() {
        // empty
    }

    public static String convertPkg(List<String> pkg) {
        return String.join(".", pkg);
    }

    public static TypeName convertPrimitive(JavaType type) {
        String primitive = type.name();

        String pkg = switch (primitive) {
            case "duration", "dateTime", "time", "date" -> "java.time";
            default -> "";
        };

        String name = switch (primitive) {
            case "string", "NOTATION", "QName", "anyURI", "IDREFS", "hexBinary", "base64Binary" -> "String";
            case "boolean" -> "boolean";
            case "float" -> "float";
            case "double" -> "double";
            case "decimal" -> "long";
            case "duration" -> "Duration";
            case "dateTime" -> "LocalDateTime";
            case "time" -> "LocalTime";
            case "date" -> "LocalDate";
            case "gYearMonth", "gMonth", "gDay", "gMonthDay", "gYear" -> "int";
            default -> throw new IllegalArgumentException("Unexpected value: " + primitive);
        };

        return ClassName.get(pkg, name);
    }

    public static TypeName convertType(JavaType type, Resolver resolver) {
        return convertType(type, resolver, type.isList());
    }

    public static TypeName convertType(JavaType type, Resolver resolver, boolean isList) {
        type = resolver.resolve(type);
        Queue<String> all = new LinkedList<>(type.outer());

        all.add(type.name());
        ClassName result = ClassName.get(convertPkg(type.pkg()), all.remove());

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
        String typeName = type.name();
        String prefix = typeName.equals("boolean")
                ? "is"
                : "get";

        System.out.println(type.name());

        return prefix + new Name(name).toVarUpper();
    }
}
