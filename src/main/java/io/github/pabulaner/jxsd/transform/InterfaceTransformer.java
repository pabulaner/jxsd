package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaType;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InterfaceTransformer {

    private final List<Interfaces> transforms;

    @SuppressWarnings("unchecked")
    public InterfaceTransformer(List<URL> xml) throws IOException {
        XmlMapper mapper = new XmlMapper();
        transforms = new ArrayList<>();

        for (URL value : xml) {
            XmlObject object = new XmlObject(mapper.readValue(value, Map.class));
            transforms.add(Interfaces.parse(object));
        }
    }

    public List<JavaClass> transform(List<JavaClass> input) {

    }

    private JavaClass transform(JavaClass input) {
        transforms.forEach(transform -> {
            JavaType type = input.type();

            if (transform.pkg().equals(type.pkg())) {
                transform.interfaces().forEach(iface -> {
                    iface.implementations().forEach(impl -> {
                        if (impl.equals(type.name().name())) {

                        }
                    });
                });
            }
        });
    }
}
