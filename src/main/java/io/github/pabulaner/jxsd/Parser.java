package io.github.pabulaner.jxsd;

import io.github.pabulaner.jxsd.gen.Generator;
import io.github.pabulaner.jxsd.gen.GeneratorConfig;
import io.github.pabulaner.jxsd.java.JavaParser;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.xsd.XsdParser;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Parser {

    private final URL xsd;

    private final GeneratorConfig config;

    public Parser(String xsd, GeneratorConfig config) throws URISyntaxException, MalformedURLException {
        this.xsd = new URI(xsd).toURL();
        this.config = config;
    }

    public void parse() throws SAXException, IOException {
        XsdResult xsdResult = new XsdParser().parse(xsd);
        JavaResult javaResult = new JavaParser().parse(xsdResult);
        Generator generator = new Generator(config);

        generator.generate(javaResult);
    }
}
