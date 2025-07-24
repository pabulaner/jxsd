package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GammaTransformModel;

public class GammaTransformBuilder {
  public GammaTransformBuilder() {
  }

  public GammaTransformModel build() {
    return new GammaTransformModel();
  }

  public GammaTransformBuilder from(GammaTransformModel value) {
    return this;
  }
}
