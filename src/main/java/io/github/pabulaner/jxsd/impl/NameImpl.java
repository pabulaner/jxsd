package io.github.pabulaner.jxsd.impl;

import io.github.pabulaner.jxsd.api.IName;

public class NameImpl implements IName {

    private final String value;

    public NameImpl(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
