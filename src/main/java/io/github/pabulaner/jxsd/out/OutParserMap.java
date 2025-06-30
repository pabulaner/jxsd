package io.github.pabulaner.jxsd.out;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;

public interface OutParserMap {

    TypeSpec parse(boolean isStatic, JavaClass clazz);
}
