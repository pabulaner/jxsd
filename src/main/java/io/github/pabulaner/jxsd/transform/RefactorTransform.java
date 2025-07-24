package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Defines a refactor transform. Can be either rename or replace.
 */
public final class RefactorTransform {

    /**
     * The value to replace.
     */
    private final String value;

    /**
     * The replacement of the value.
     */
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
