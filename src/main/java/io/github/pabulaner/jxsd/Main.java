package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaFile;
import io.github.pabulaner.jxsd.java.JavaParser;
import io.github.pabulaner.jxsd.out.OutWriter;
import io.github.pabulaner.jxsd.xsd.XsdParser;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.List;

public class Main {

    private static final List<String> MODES = List.of("model");

    public static void main(String[] args) throws SAXException, IOException, TemplateException {
        XsdResult xsd = new XsdParser().parse(Main.class.getResource("/xsd/dml-chart.xsd"));

        for (String mode : MODES) {
            List<JavaFile> files = new JavaParser("test").parse(xsd);

            for (JavaFile file : files) {
                new OutWriter().write(mode, file);
            }
        }
    }


}
