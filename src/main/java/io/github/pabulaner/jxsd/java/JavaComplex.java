package io.github.pabulaner.jxsd.java;

import java.util.List;

public interface JavaComplex extends JavaClass {

    List<JavaClass> inners();

    List<JavaField> fields();
}
