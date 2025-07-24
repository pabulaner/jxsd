package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ShapeTypeModel;

public class ShapeTypeBuilder {
  private ShapeTypeModel value;

  public ShapeTypeBuilder() {
    this.value = null;
  }

  public ShapeTypeBuilder from(ShapeTypeModel value) {
    this.value = value;
    return this;
  }

  public ShapeTypeModel build() {
    return this.value;
  }

  public ShapeTypeBuilder setValue(ShapeTypeModel value) {
    this.value = value;
    return this;
  }
}
