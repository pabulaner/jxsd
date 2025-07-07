package io.github.pabulaner.jxsd.transform;

import java.util.ArrayList;
import java.util.List;

public record Interface(String name, List<String> implementations) {

    public static Interface parse(XmlObject xml) {
        String name = xml.getString("name");
        List<String> implementations = new ArrayList<>();
        XmlList list = xml.getObject("implementations")
                .getList("implementation");

        for (int i = 0; i < list.size(); i++) {
            implementations.add(list.getObject(i).getString("name"));
        }

        return new Interface(name, implementations);
    }
}
