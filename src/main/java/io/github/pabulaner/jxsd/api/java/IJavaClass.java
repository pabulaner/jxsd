package io.github.pabulaner.jxsd.api.java;

import java.util.List;

public interface IJavaClass extends IJavaModel {

    List<IJavaField> fields();
}
