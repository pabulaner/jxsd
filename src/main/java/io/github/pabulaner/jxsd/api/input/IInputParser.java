package io.github.pabulaner.jxsd.api.input;

import io.github.pabulaner.jxsd.api.model.IPackage;
import org.xml.sax.SAXException;

import java.net.URL;

public interface IInputParser {

    IPackage parse(URL url) throws Exception;
}
