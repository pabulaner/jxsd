package io.github.pabulaner.jxsd.transform;

import java.util.ArrayList;
import java.util.List;

public record Names(List<String> pkg, List<Name> names) {

    public static Names parse(XmlObject xml) {
        List<String> pkg = List.of(xml.getString("pkg").split("\\."));
        List<Name> names = new ArrayList<>();
        XmlList list = xml.getList("interface");

        for (int i = 0; i < list.size(); i++) {
            names.add(Name.parse(list.getObject(i)));
        }

        return new Names(pkg, names);
    }
}
