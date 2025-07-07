package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NameTransformer {

    private final List<Interfaces> transforms;

    public NameTransformer(List<URL> xml) throws IOException {
        XmlMapper mapper = new XmlMapper();
        transforms = new ArrayList<>();

        for (URL value : xml) {
//            mapper.writerWithDefaultPrettyPrinter().writeValue(System.out, new Interfaces("hello", List.of(
//                    new Interfaces.Interface("1", List.of(new Interfaces.Interface.Implementation("2"), new Interfaces.Interface.Implementation("100"))),
//                    new Interfaces.Interface("3", List.of(new Interfaces.Interface.Implementation("3"))),
//                    new Interfaces.Interface("5", List.of(new Interfaces.Interface.Implementation("5"))))));

            System.out.println(mapper.readValue(value, Map.class));
        }

        System.out.println(transforms);
    }
}
