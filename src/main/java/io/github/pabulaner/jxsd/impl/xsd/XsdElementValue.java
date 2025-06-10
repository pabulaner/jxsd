package io.github.pabulaner.jxsd.impl.xsd;

public record XsdElementValue(int minOccurs, int maxOccurs, XsdType type, String name, String value) implements XsdValue {
}
