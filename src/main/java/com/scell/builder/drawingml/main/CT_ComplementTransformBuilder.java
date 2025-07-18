package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_ComplementTransformModel;

public class CT_ComplementTransformBuilder {
  public CT_ComplementTransformBuilder() {
  }

  public CT_ComplementTransformModel build() {
    return new CT_ComplementTransformModel();
  }

  public CT_ComplementTransformBuilder from(CT_ComplementTransformModel value) {
    return this;
  }
}
