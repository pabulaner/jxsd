package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GrayscaleEffectModel;

public class GrayscaleEffectBuilder {
  public GrayscaleEffectBuilder() {
  }

  public GrayscaleEffectModel build() {
    return new GrayscaleEffectModel();
  }

  public GrayscaleEffectBuilder from(GrayscaleEffectModel value) {
    return this;
  }
}
