package io.github.pabulaner.jxsd.api.out;

import io.github.pabulaner.jxsd.api.java.IJavaClass;
import io.github.pabulaner.jxsd.api.java.IJavaField;
import io.github.pabulaner.jxsd.api.java.IJavaType;

import java.util.List;

public interface IOutClassBuilder {

    IOutClassBuilder addFields(List<IJavaField> fields, boolean isFinal);

    IOutClassBuilder addConstructor(List<IJavaField> params, boolean isPrivate);

    IOutClassBuilder addClasses(List<IJavaClass> classes);

    IOutClassBuilder addMethod(IJavaType type, String name);

    IOutClassBuilder addGetters();

    IOutClassBuilder addSetters();
}
