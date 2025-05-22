package io.github.pabulaner.jxsd.api.out;

import io.github.pabulaner.jxsd.api.java.IJavaModel;

import java.util.List;

public interface IOutParser {

    void parse(List<IJavaModel> models);
}
