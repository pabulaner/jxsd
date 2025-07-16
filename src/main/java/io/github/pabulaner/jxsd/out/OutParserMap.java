package io.github.pabulaner.jxsd.out;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

public interface OutParserMap {

    TypeSpec parse(boolean isStatic, JavaClass clazz);

    Resolver getResolver();
}
