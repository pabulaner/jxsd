package io.github.pabulaner.jxsd.api.other;

public interface IElementValue extends IValue {

    IType getType();

    String getName();

    String getValue();
}
