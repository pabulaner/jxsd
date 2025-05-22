package io.github.pabulaner.jxsd.api.java;

import java.util.List;

public interface IJavaField {

    IJavaType type();

    IJavaName name();

    String value();

    List<IJavaValidator> validators();
}
