package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveCoordinateModel;

public class PositiveCoordinateBuilder {
  private long value;

  public PositiveCoordinateBuilder() {
  }

  public PositiveCoordinateBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public PositiveCoordinateBuilder from(PositiveCoordinateModel value) {
    this.value = value.getValue();
    return this;
  }

  public PositiveCoordinateModel build() {
    return new PositiveCoordinateModel(this.value);
  }
}
