package io.github.pabulaner.jxsd;

import io.github.pabulaner.jxsd.api.java.IJavaModel;
import io.github.pabulaner.jxsd.api.xsd.IModel;
import io.github.pabulaner.jxsd.impl.JavaWriter;
import io.github.pabulaner.jxsd.impl.java.JavaParser;
import io.github.pabulaner.jxsd.impl.xsd.XsdParser;
import org.xml.sax.SAXException;

import java.util.List;

public class Main {

    public static void main(String[] args) throws SAXException {
        List<IModel> models = new XsdParser().parse(Main.class.getResource("/xsd/dml-chart.xsd"));
        List<IJavaModel> javaModels = new JavaParser().parse(models);
        new JavaWriter().write(javaModels);

        System.out.println(javaModels);
    }
}
