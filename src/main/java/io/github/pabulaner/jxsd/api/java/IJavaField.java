package io.github.pabulaner.jxsd.api.java;

import java.util.List;

public interface IJavaField {

    IJavaType type();

    String name();

    String value();

    List<IJavaValidator> validators();
}
