package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_InverseGammaTransformModel;

public class CT_InverseGammaTransformBuilder {
  public CT_InverseGammaTransformBuilder() {
  }

  public CT_InverseGammaTransformModel build() {
    return new CT_InverseGammaTransformModel();
  }

  public CT_InverseGammaTransformBuilder from(CT_InverseGammaTransformModel value) {
    return this;
  }
}
