package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_InverseTransformModel;

public class CT_InverseTransformBuilder {
  public CT_InverseTransformBuilder() {
  }

  public CT_InverseTransformModel build() {
    return new CT_InverseTransformModel();
  }

  public CT_InverseTransformBuilder from(CT_InverseTransformModel value) {
    return this;
  }
}
