package io.github.pabulaner.jxsd.spec.resolver;

import com.squareup.javapoet.ClassName;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.util.ParserUtil;
import io.github.pabulaner.jxsd.util.Name;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimitiveResolver implements Resolver {

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

    private final JavaScope scope;

    public PrimitiveResolver(JavaScope scope) {
        this.scope = scope;
    }

    @Override
    public JavaType resolve(JavaType original, JavaType type) {
        String name = findPrimitive(original);

        List<String> pkg = switch (name) {
            case "duration", "dateTime", "time", "date" -> List.of("java", "time");
            default -> List.of();
        };

        return new JavaType.Builder(type)
                .setPkg(pkg)
                .setOuter(List.of())
                .setName(name)
                .build();
    }

    private String findPrimitive(JavaType type) {
        String name = PRIMITIVE_MAP.get(type.getName());

        if (name == null) {
            JavaRestriction restriction = (JavaRestriction) scope.get(type);
            return findPrimitive(restriction.getParent());
        }

        return name;
    }
}
