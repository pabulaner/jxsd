package io.github.pabulaner.jxsd.xsd;

public record XsdElementValue(String name, int minOccurs, int maxOccurs, XsdStruct struct, XsdType type, String value) implements XsdValue {
}
