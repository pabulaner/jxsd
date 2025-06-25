package io.github.pabulaner.jxsd.java;

import java.util.List;

public record JavaFile(List<String> imports, JavaClass content) {
}
