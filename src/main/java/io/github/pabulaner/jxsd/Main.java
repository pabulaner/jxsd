package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.impl.java.JavaStructParser;
import io.github.pabulaner.jxsd.impl.xsd.XsdParser;
import io.github.pabulaner.jxsd.impl.xsd.XsdResult;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SAXException, IOException, TemplateException {
        List<XsdResult> result = new XsdParser().parse(Main.class.getResource("/xsd/dml-chart.xsd"));
        new JavaStructParser().parse(result);

        // new OutClassParser().parse(javaModels);
        // new OutBuilderParser().parse(javaModels);
        // new OutToDocx4jParser().parse(javaModels);
    }
}
