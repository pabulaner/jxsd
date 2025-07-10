package io.github.pabulaner.jxsd;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaParser;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.out.OutWriter;
import io.github.pabulaner.jxsd.out.builder.BuilderParserMap;
import io.github.pabulaner.jxsd.out.model.ModelParserMap;
import io.github.pabulaner.jxsd.transform.RootTransform;
import io.github.pabulaner.jxsd.transform.Transformer;
import io.github.pabulaner.jxsd.xsd.XsdParser;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
