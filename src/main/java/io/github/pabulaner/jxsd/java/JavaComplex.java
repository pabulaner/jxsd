package io.github.pabulaner.jxsd.java;

import org.docx4j.convert.out.html.TagClass;

import java.util.List;

public interface JavaComplex extends JavaClass {

    List<JavaType> interfaces();

    List<JavaClass> inners();

    List<JavaField> fields();
}
