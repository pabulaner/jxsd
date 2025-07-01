package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaParser;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.out.OutWriter;
import io.github.pabulaner.jxsd.xsd.XsdParser;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    private static final List<String> MODES = List.of("converter");

    public static void main(String[] args) throws SAXException, IOException, TemplateException {
        Map<String, String> pkgConverter = new HashMap<>();
        //pkgConverter.put("ooxml", "");
        //pkgConverter.put("main", "");
        //pkgConverter.put("drawingml", "dml");

        JavaParser.Config config = new JavaParser.Config(List.of("test"), pkgConverter);

        XsdResult xsd = new XsdParser().parse(Main.class.getResource("/xsd/dml/dml-chart.xsd"));
        JavaResult java = new JavaParser(config).parse(xsd);
        OutWriter writer = new OutWriter(java);

        writer.write(Path.of("generated"), MODES);
    }
}
