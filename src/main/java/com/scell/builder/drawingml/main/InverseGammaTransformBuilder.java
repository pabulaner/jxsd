package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.InverseGammaTransformModel;

public class InverseGammaTransformBuilder {
  public InverseGammaTransformBuilder() {
  }

  public InverseGammaTransformModel build() {
    return new InverseGammaTransformModel();
  }

  public InverseGammaTransformBuilder from(InverseGammaTransformModel value) {
    return this;
  }
}
