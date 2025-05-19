package io.github.pabulaner.jxsd.parser;

import com.sun.xml.xsom.XSComplexType;

public class ComplexParser extends Parser<XSComplexType> {

    public ComplexParser(ParserMap map) {
        super(map);
    }

    @Override
    public Result parse(XSComplexType xs) {
        xs.getElementDecls().get(0).
        return null;
    }
}
