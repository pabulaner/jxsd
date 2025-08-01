package io.github.pabulaner.jxsd.out.parser;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import javax.lang.model.element.Modifier;

public abstract class BaseParser<TClass extends JavaClass> implements Parser<TClass> {

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

    private final ParserGroup group;

    private final ClassType classType;

    protected BaseParser(ParserGroup group) {
        this(group, ClassType.CLASS);
    }

    protected BaseParser(ParserGroup group, ClassType classType) {
        this.group = group;
        this.classType = classType;
    }

    @Override
    public TypeSpec parse(boolean isStatic, TClass clazz) {
        String name = group.getResolver().resolve(clazz.getType()).getName();
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

    public ParserGroup getGroup() {
        return group;
    }

    public Resolver getResolver() {
        return group.getResolver();
    }
}
