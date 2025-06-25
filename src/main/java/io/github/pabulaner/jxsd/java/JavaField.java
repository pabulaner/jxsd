package io.github.pabulaner.jxsd.java;

import java.util.function.Supplier;

public record JavaField(JavaType type, JavaType name, Supplier<Class<? extends JavaClass>> classSupplier) {
}
