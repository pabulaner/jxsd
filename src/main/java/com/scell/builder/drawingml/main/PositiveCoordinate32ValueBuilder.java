package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveCoordinate32ValueModel;

public class PositiveCoordinate32ValueBuilder {
  private int value;

  public PositiveCoordinate32ValueBuilder() {
  }

  public PositiveCoordinate32ValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public PositiveCoordinate32ValueBuilder from(PositiveCoordinate32ValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public PositiveCoordinate32ValueModel build() {
    return new PositiveCoordinate32ValueModel(this.value);
  }
}
