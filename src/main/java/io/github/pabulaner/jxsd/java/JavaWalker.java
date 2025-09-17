package io.github.pabulaner.jxsd.java;

public class JavaWalker {

    public JavaWalker() {
    }

    public void walk(JavaListener listener, JavaClass value) {
        enterClass(listener, value);
        value.getInterfaces().forEach(listener::visitInterface);

        if (value instanceof JavaComplex casted) {
            casted.getInners().forEach(inner -> walk(listener, value));
            casted.getFields().forEach(listener::visitField);
        }

        exitClass(listener, value);
    }

    private void enterClass(JavaListener listener, JavaClass value) {
        listener.enterClass(value);

        switch (value) {
            case JavaPrimitive casted -> listener.enterPrimitive(casted);
            case JavaRestriction casted -> listener.enterRestriction(casted);
            case JavaUnion casted -> listener.enterUnion(casted);
            case JavaList casted -> listener.enterList(casted);
            case JavaEnum casted -> listener.enterEnum(casted);
            case JavaComplex casted -> enterComplex(listener, casted);
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    private void exitClass(JavaListener listener, JavaClass value) {
        switch (value) {
            case JavaPrimitive casted -> listener.exitPrimitive(casted);
            case JavaRestriction casted -> listener.exitRestriction(casted);
            case JavaUnion casted -> listener.exitUnion(casted);
            case JavaList casted -> listener.exitList(casted);
            case JavaEnum casted -> listener.exitEnum(casted);
            case JavaComplex casted -> exitComplex(listener, casted);
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }

        listener.exitClass(value);
    }

    private void enterComplex(JavaListener listener, JavaComplex value) {
        listener.enterComplex(value);

        switch (value) {
            case JavaSequence casted -> listener.enterSequence(casted);
            case JavaChoice casted -> listener.enterChoice(casted);
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    private void exitComplex(JavaListener listener, JavaComplex value) {
        switch (value) {
            case JavaSequence casted -> listener.exitSequence(casted);
            case JavaChoice casted -> listener.exitChoice(casted);
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }

        listener.exitComplex(value);
    }
}
