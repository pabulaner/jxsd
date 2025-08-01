package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveCoordinateValueModel;

public class PositiveCoordinateValueBuilder {
  private long value;

  public PositiveCoordinateValueBuilder() {
  }

  public PositiveCoordinateValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public PositiveCoordinateValueBuilder from(PositiveCoordinateValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public PositiveCoordinateValueModel build() {
    return new PositiveCoordinateValueModel(this.value);
  }
}
