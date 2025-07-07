package io.github.pabulaner.jxsd.java;

import java.util.List;

public interface JavaClass {

    JavaType type();

    List<JavaType> interfaces();

    JavaClass withType(JavaType type);
}
