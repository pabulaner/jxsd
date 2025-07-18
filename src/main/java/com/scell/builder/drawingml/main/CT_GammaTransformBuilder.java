package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GammaTransformModel;

public class CT_GammaTransformBuilder {
  public CT_GammaTransformBuilder() {
  }

  public CT_GammaTransformModel build() {
    return new CT_GammaTransformModel();
  }

  public CT_GammaTransformBuilder from(CT_GammaTransformModel value) {
    return this;
  }
}
