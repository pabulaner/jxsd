package io.github.pabulaner.jxsd;

import io.github.pabulaner.jxsd.input.InputParser;
import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) throws SAXException {
        new InputParser().parse(Main.class.getResource("/xsd/shared-documentPropertiesVariantTypes.xsd"));
    }
}
