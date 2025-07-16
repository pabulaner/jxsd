package io.github.pabulaner.jxsd.out;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.resolver.Name;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import javax.lang.model.element.Modifier;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public abstract class OutParser<TClass extends JavaClass> {

    protected static final String THIS = "this";

    protected static final String SUPER = "super";

    protected static final String NEW = "new";

    protected static final String RETURN = "return";

    protected static final String IF = "if";

    protected static final String INSTANCEOF = "instanceof";

    protected static final String NULL = "null";

    protected static final String VALUE = "value";

    protected static final String IS = "is";

    protected static final String GET = "get";

    protected static final String SET = "set";

    protected static final String TYPE = "type";

    protected enum ClassType {

        CLASS,
        ENUM,
        INTERFACE,
    }

    private final ClassType classType;

    private final Resolver resolver;

    protected OutParser(ClassType classType, Resolver resolver) {
        this.classType = classType;
        this.resolver = resolver;
    }

    public TypeSpec parse(boolean isStatic, TClass clazz) {
        String name = resolver.type(clazz.type()).name();
        TypeSpec.Builder builder = switch (classType) {
            case CLASS -> TypeSpec.classBuilder(name);
            case ENUM -> TypeSpec.enumBuilder(name);
            case INTERFACE -> TypeSpec.interfaceBuilder(name);
        };

        builder.addModifiers(Modifier.PUBLIC);

        if (isStatic) {
            builder.addModifiers(Modifier.STATIC);
        }

        return parse(builder, clazz).build();
    }

    protected abstract TypeSpec.Builder parse(TypeSpec.Builder builder, TClass clazz);

    public static String parsePkg(List<String> pkg) {
        return String.join(".", pkg);
    }

    public static TypeName parsePrimitive(JavaType type) {
        String primitive = type.name();

        String pkg = switch (primitive) {
            case "duration", "dateTime", "time", "date" -> "java.time";
            default -> "";
        };

        String name = switch (primitive) {
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
            default -> throw new IllegalArgumentException("Unexpected value: " + primitive);
        };

        return ClassName.get(pkg, name);
    }

    public static TypeName parseType(JavaType type, Resolver resolver) {
        type = resolver.type(type);
        Queue<String> all = new LinkedList<>(type.outer());

        all.add(type.name());
        ClassName result = ClassName.get(parsePkg(type.pkg()), all.remove());

        while (!all.isEmpty()) {
            result = result.nestedClass(all.remove());
        }

        if (type.isList()) {
            ClassName list = ClassName.get(List.class);
            return ParameterizedTypeName.get(list, result);
        } else {
            return result;
        }
    }

    public static String parseMethod(String... parts) {
        boolean[] first = { true };
        return Arrays.stream(parts)
                .map(part -> {
                    if (first[0]) {
                        first[0] = false;
                        return part;
                    } else {
                        return new Name(part).toUpper();
                    }
                })
                .collect(Collectors.joining());
    }

    public Resolver getResolver() {
        return resolver;
    }
}
