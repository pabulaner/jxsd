package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ComplementTransformModel;

public class ComplementTransformBuilder {
  public ComplementTransformBuilder() {
  }

  public ComplementTransformModel build() {
    return new ComplementTransformModel();
  }

  public ComplementTransformBuilder from(ComplementTransformModel value) {
    return this;
  }
}
