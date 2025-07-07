package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.pabulaner.jxsd.java.JavaClass;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public abstract class Transformer<TTransform> {

    private final List<TTransform> transforms;

    @SuppressWarnings("unchecked")
    public Transformer(List<URL> xml, Function<XmlObject, TTransform> converter) throws IOException {
        XmlMapper mapper = new XmlMapper();
        transforms = new ArrayList<>();

        for (URL value : xml) {
            XmlObject object = new XmlObject(mapper.readValue(value, Map.class));
            transforms.add(converter.apply(object));
        }
    }

    public List<JavaClass> transform(List<JavaClass> input) {
        return input.stream()
                .map(this::transform)
                .toList();
    }

    private JavaClass transform(JavaClass input) {
        for (TTransform value : transforms) {
            input = transform(input, value);
        }

        return input;
    }

    protected abstract JavaClass transform(JavaClass input, TTransform transform);

    public List<TTransform> getTransforms() {
        return transforms;
    }
}
