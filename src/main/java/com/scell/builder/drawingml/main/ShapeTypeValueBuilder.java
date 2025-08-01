package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ShapeTypeValueModel;

public class ShapeTypeValueBuilder {
  private ShapeTypeValueModel value;

  public ShapeTypeValueBuilder() {
    this.value = null;
  }

  public ShapeTypeValueBuilder from(ShapeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public ShapeTypeValueModel build() {
    return this.value;
  }

  public ShapeTypeValueBuilder setValue(ShapeTypeValueModel value) {
    this.value = value;
    return this;
  }
}
