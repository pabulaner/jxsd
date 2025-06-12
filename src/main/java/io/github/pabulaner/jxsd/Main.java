package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaStructParser;
import io.github.pabulaner.jxsd.xsd.XsdParser;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import org.xml.sax.SAXException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws SAXException, IOException, TemplateException {
        XsdResult result = new XsdParser().parse(Main.class.getResource("/xsd/dml-chart.xsd"));
        new JavaStructParser().parse("model", result);

        // new OutClassParser().parse(javaModels);
        // new OutBuilderParser().parse(javaModels);
        // new OutToDocx4jParser().parse(javaModels);
    }
}
