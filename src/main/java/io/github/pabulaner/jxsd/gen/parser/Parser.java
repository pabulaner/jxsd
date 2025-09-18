package io.github.pabulaner.jxsd.gen.parser;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;

public interface Parser<TClass extends JavaClass> {

    TypeSpec parse(boolean isStatic, TClass clazz);
}
