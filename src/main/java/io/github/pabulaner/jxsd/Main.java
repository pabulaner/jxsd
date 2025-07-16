package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {

    private static final List<String> MODES = List.of("converter");

    public static void main(String[] args) throws SAXException, IOException, TemplateException {
        JXsdParser.parse(new JXsdParser.Config()
                .addPkgConverter("drawingml", "dml")
                .setBasePkg("models.pkg")
                .setXsdFile(Main.class.getResource("/xsd/dml/dml-chart.xsd"))
                .addTransformFile(Main.class.getResource("/transforms/transform.xml"))
                .setOutputPath(Path.of("src/main/java/")));
    }
}
