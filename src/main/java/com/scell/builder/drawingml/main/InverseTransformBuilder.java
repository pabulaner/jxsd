package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.InverseTransformModel;

public class InverseTransformBuilder {
  public InverseTransformBuilder() {
  }

  public InverseTransformModel build() {
    return new InverseTransformModel();
  }

  public InverseTransformBuilder from(InverseTransformModel value) {
    return this;
  }
}
