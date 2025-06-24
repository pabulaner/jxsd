package io.github.pabulaner.jxsd.xsd;

public record XsdElementValue(int minOccurs, int maxOccurs, XsdStruct struct, XsdType type, String name, String value) implements XsdValue {
}
