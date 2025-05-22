package io.github.pabulaner.jxsd.api.xsd;

public interface IXsdElementValue extends IXsdValue {

    IXsdType type();

    String name();

    String value();
}
