package io.github.pabulaner.jxsd;

import io.github.pabulaner.jxsd.api.java.IJavaModel;
import io.github.pabulaner.jxsd.api.xsd.IXsdModel;
import io.github.pabulaner.jxsd.impl.java.JavaParser;
import io.github.pabulaner.jxsd.impl.out.OutBuilderParser;
import io.github.pabulaner.jxsd.impl.out.OutClassParser;
import io.github.pabulaner.jxsd.impl.out.OutToDocx4jParser;
import io.github.pabulaner.jxsd.impl.out2.Out2Parser;
import io.github.pabulaner.jxsd.impl.xsd.XsdParser;
import org.xml.sax.SAXException;

import java.util.List;

public class Main {

    public static void main(String[] args) throws SAXException {
        List<IXsdModel> models = new XsdParser().parse(Main.class.getResource("/xsd/book.xsd"));
        List<IJavaModel> javaModels = new JavaParser().parse(models);

        new Out2Parser().parse(javaModels);
        // new OutClassParser().parse(javaModels);
        // new OutBuilderParser().parse(javaModels);
        // new OutToDocx4jParser().parse(javaModels);
    }
}
