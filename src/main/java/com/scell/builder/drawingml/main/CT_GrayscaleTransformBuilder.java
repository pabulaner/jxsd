package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GrayscaleTransformModel;

public class CT_GrayscaleTransformBuilder {
  public CT_GrayscaleTransformBuilder() {
  }

  public CT_GrayscaleTransformModel build() {
    return new CT_GrayscaleTransformModel();
  }

  public CT_GrayscaleTransformBuilder from(CT_GrayscaleTransformModel value) {
    return this;
  }
}
