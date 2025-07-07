package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaType;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class InterfaceTransformer extends Transformer<Interfaces> {

    public InterfaceTransformer(List<URL> xml) throws IOException {
        super(xml, Interfaces::parse);
    }

    @Override
    protected JavaClass transform(JavaClass input, Interfaces transform) {
        JavaType type = input.getType();

        if (transform.pkg().equals(type.getPkg())) {
            for (Interface iface : transform.interfaces()) {
                for (String impl : iface.implementations()) {
                    if (impl.equals(type.getName().getName())) {
                        JavaType value = new JavaType(type.getPkg(), new JavaName(iface.name()));
                        input.getInterfaces().add(value);
                    }
                }
            }
        }

        return input;
    }
}
