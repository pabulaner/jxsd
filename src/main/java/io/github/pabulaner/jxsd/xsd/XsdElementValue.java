package io.github.pabulaner.jxsd.xsd;

public record XsdElementValue(int minOccurs, int maxOccurs, XsdType type, String name, String value) implements XsdValue {
}
