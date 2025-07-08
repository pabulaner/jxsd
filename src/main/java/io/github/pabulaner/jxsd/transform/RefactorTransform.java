package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public final class RefactorTransform {

    private final String value;

    private final String with;

    public RefactorTransform(
            @JacksonXmlProperty(localName = "value")
            String value,
            @JacksonXmlProperty(localName = "with")
            String with
    ) {
        this.value = value;
        this.with = with;
    }

    public String getValue() {
        return value;
    }

    public String getWith() {
        return with;
    }
}
