package io.github.pabulaner.jxsd.parser;

import io.github.pabulaner.jxsd.parser.model.Model;

public class Result {

    private final Model model;

    public Result(Model model) {
        if (model == null) {
            throw new IllegalArgumentException("Model can not be null");
        }

        this.model = model;
    }

    public <T extends Model> T get(Class<T> modelClass) {
        return modelClass.isInstance(model)
                ? modelClass.cast(model)
                : null;
    }
}
