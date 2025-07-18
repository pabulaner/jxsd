package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GrayscaleEffectModel;

public class CT_GrayscaleEffectBuilder {
  public CT_GrayscaleEffectBuilder() {
  }

  public CT_GrayscaleEffectModel build() {
    return new CT_GrayscaleEffectModel();
  }

  public CT_GrayscaleEffectBuilder from(CT_GrayscaleEffectModel value) {
    return this;
  }
}
