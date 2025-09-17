package io.github.pabulaner.jxsd.java;

public interface JavaListener {

    void enterClass(JavaClass value);

    void exitClass(JavaClass value);

    void enterPrimitive(JavaPrimitive value);

    void exitPrimitive(JavaPrimitive value);

    void enterRestriction(JavaRestriction value);

    void exitRestriction(JavaRestriction value);

    void enterList(JavaList value);

    void exitList(JavaList value);

    void enterUnion(JavaUnion value);

    void exitUnion(JavaUnion value);

    void enterEnum(JavaEnum value);

    void exitEnum(JavaEnum value);

    void enterComplex(JavaComplex value);

    void exitComplex(JavaComplex value);

    void enterSequence(JavaSequence value);

    void exitSequence(JavaSequence value);

    void enterChoice(JavaChoice value);

    void exitChoice(JavaChoice value);

    void visitInterface(JavaType value);

    void visitField(JavaField value);
}
