package io.github.pabulaner.jxsd.xsd;

import java.util.List;

public record XsdComplexStruct(XsdType type, List<XsdValue> values) implements XsdStruct {
}
