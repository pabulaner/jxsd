package io.github.pabulaner.jxsd.api.java;

import java.util.List;

public interface IJavaField extends IJavaModel {

    String name();

    String value();

    List<IJavaValidator> validators();
}
