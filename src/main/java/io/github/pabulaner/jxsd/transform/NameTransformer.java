package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.pabulaner.jxsd.java.JavaClass;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class NameTransformer extends Transformer<Names> {


    public NameTransformer(List<URL> xml) throws IOException {
        super(xml, Names::parse);
    }

    @Override
    protected JavaClass transform(JavaClass input, Names names) {


        return input;
    }
}
