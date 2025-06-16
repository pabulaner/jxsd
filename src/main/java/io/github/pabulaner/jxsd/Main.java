package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.parser.JavaResult;
import io.github.pabulaner.jxsd.java.parser.JavaStructParser;
import io.github.pabulaner.jxsd.out.OutWriter;
import io.github.pabulaner.jxsd.xsd.XsdParser;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {

    private static final List<String> TYPES = List.of("model", "builder", "converter");

    public static void main(String[] args) throws SAXException, IOException, TemplateException {
        XsdResult xsd = new XsdParser().parse(Main.class.getResource("/xsd/dml-chart.xsd"));

        for (String type : TYPES) {
            List<JavaResult> java = new JavaStructParser().parse(type, xsd);

            for (JavaResult result : java) {
                new OutWriter().write(Path.of("./generated/" + type), result);
            }
        }
    }


}
