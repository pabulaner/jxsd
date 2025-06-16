package io.github.pabulaner.jxsd.java.model;

import java.util.List;

public record JavaFile(String namespace, List<String> imports, JavaClass content) {
}
