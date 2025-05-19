package io.github.pabulaner.jxsd.api.xsd;

public interface IElementValue extends IValue {

    IType type();

    String name();

    String value();
}
