package io.github.pabulaner.jxsd.transform;

import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaComplex;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaField;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.java.JavaUnion;

import java.util.List;

public final class TransformUtil {

    private TransformUtil() {
        // empty
    }

    public static JavaType withName(JavaType type, String name) {
        return new JavaType(type.pkg(), type.outer(), name, type.minOccurs(), type.maxOccurs());
    }

    public static JavaField withName(JavaField field, String name) {
        return new JavaField(field.type(), name);
    }

    public static JavaField withType(JavaField field, JavaType type) {
        return new JavaField(type, field.name());
    }

    public static <TClass extends JavaClass> TClass withType(TClass clazz, JavaType type) {
        return (TClass) switch (clazz) {
            case JavaPrimitive ignored -> new JavaPrimitive(type);
            case JavaRestriction casted -> new JavaRestriction(type, casted.parent(), casted.primitive(), casted.restrictions());
            case JavaUnion casted -> new JavaUnion(type, casted.types());
            case JavaEnum casted -> new JavaEnum(type, casted.values());
            case JavaSequence casted -> new JavaSequence(type, casted.inners(), casted.fields());
            case JavaChoice casted -> new JavaChoice(type, casted.inners(), casted.fields());
            default -> throw new IllegalStateException("Unexpected value: " + clazz);
        };
    }

    public static <TClass extends JavaComplex> TClass withInnersAndFields(TClass clazz, List<JavaClass> inners, List<JavaField> fields) {
        return (TClass) switch (clazz) {
            case JavaSequence casted -> new JavaSequence(casted.type(), inners, fields);
            case JavaChoice casted -> new JavaChoice(casted.type(), inners, fields);
            default -> throw new IllegalStateException("Unexpected value: " + clazz);
        };
    }
}
