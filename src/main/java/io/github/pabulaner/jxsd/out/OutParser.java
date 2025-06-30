package io.github.pabulaner.jxsd.out;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaType;

import javax.lang.model.element.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class OutParser<TClass extends JavaClass> {

    protected static final String THIS = "this";

    protected static final String SUPER = "super";

    protected static final String NEW = "new";

    protected static final String RETURN = "return";

    protected static final String INSTANCEOF = "instanceof";

    protected static final String NULL = "null";

    private final boolean isEnum;

    private final Function<JavaName, String> mapper;

    protected OutParser(Function<JavaName, String> mapper) {
        this(false, mapper);
    }

    protected OutParser(boolean isEnum, Function<JavaName, String> mapper) {
        this.isEnum = isEnum;
        this.mapper = mapper;
    }

    public TypeSpec parse(boolean isStatic, TClass clazz) {
        String name = mapper.apply(clazz.type().name());
        TypeSpec.Builder builder = isEnum
                ? TypeSpec.enumBuilder(name)
                : TypeSpec.classBuilder(name);

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

    public static ClassName parseType(JavaType type, Function<JavaName, String> name) {
        String[] outer = type.outer()
                .stream()
                .map(name)
                .toArray(String[]::new);

        return ClassName.get(parsePkg(type.pkg()), name.apply(type.name()), outer);
    }

    public static String parseMethod(String... parts) {
        boolean[] first = { true };
        return Arrays.stream(parts)
                .map(part -> {
                    if (first[0]) {
                        first[0] = false;
                        return part;
                    } else {
                        return new JavaName(part).toUpper();
                    }
                })
                .collect(Collectors.joining());
    }
}
