package io.github.pabulaner.jxsd.transform;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record Interfaces(List<String> pkg, List<Interface> interfaces) {

    public static Interfaces parse(XmlObject xml) {
        List<String> pkg = List.of(xml.getString("pkg").split("\\."));
        List<Interface> interfaces = new ArrayList<>();
        XmlList list = xml.getList("interface");

        for (int i = 0; i < list.size(); i++) {
            interfaces.add(Interface.parse(list.getObject(i)));
        }

        return new Interfaces(pkg, interfaces);
    }
}
