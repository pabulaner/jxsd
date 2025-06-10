package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.api.xsd.IXsdModel;
import io.github.pabulaner.jxsd.impl.java.JavaParser;
import io.github.pabulaner.jxsd.impl.xsd.XsdParser;
import io.github.pabulaner.jxsd.impl.xsd.XsdResult;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SAXException, IOException, TemplateException {
        XsdResult result = new XsdParser().parse(Main.class.getResource("/xsd/book.xsd"));
        new JavaParser().parse(result.models());

        // new OutClassParser().parse(javaModels);
        // new OutBuilderParser().parse(javaModels);
        // new OutToDocx4jParser().parse(javaModels);
    }
}
