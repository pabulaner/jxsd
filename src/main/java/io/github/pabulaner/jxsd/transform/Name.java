package io.github.pabulaner.jxsd.transform;

import java.util.ArrayList;
import java.util.List;

public record Name(List<String> outer, String before, String after) {

    public static Name parse(XmlObject xml) {
        List<String> outer = List.of(xml.getString("outer").split("\\."));
        String before = xml.getString("before");
        String after = xml.getString("after");

        return new Name(outer, before, after);
    }
}
