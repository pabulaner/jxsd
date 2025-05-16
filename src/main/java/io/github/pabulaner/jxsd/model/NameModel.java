package io.github.pabulaner.jxsd.model;

import io.github.pabulaner.jxsd.api.model.IName;

public class NameModel implements IName {

    private final String value;

    public NameModel(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
