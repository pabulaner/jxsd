package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaParser;
import io.github.pabulaner.jxsd.out.OutWriter;
import io.github.pabulaner.jxsd.xsd.XsdParser;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import org.xml.sax.SAXException;

import java.io.IOException;
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

        Set<String> additionalImports = new HashSet<>();
        additionalImports.add("org.docx4j.dml.*");
        additionalImports.add("org.docx4j.dml.chart.*");
        additionalImports.add("org.docx4j.dml.chartDrawing.*");

        JavaParser.Config config = new JavaParser.Config("test", pkgConverter);

        XsdResult xsd = new XsdParser().parse(Main.class.getResource("/xsd/dml/dml-chart.xsd"));
        List<JavaClass> classes = new JavaParser(config).parse(xsd);
        OutWriter writer = new OutWriter(classes, additionalImports);

        writer.write(MODES);
    }
}
