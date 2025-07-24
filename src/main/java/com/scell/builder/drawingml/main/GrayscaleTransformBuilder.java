package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GrayscaleTransformModel;

public class GrayscaleTransformBuilder {
  public GrayscaleTransformBuilder() {
  }

  public GrayscaleTransformModel build() {
    return new GrayscaleTransformModel();
  }

  public GrayscaleTransformBuilder from(GrayscaleTransformModel value) {
    return this;
  }
}
