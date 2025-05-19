package io.github.pabulaner.jxsd;

import io.github.pabulaner.jxsd.impl.xsd.XsdParser;
import io.github.pabulaner.jxsd.input.InputParser;
import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) throws SAXException {
        new XsdParser().parse(Main.class.getResource("/xsd/book.xsd"));
    }
}
