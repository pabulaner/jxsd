package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateModel;

public class CoordinateBuilder {
  private long value;

  public CoordinateBuilder() {
  }

  public CoordinateBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public CoordinateBuilder from(CoordinateModel value) {
    this.value = value.getValue();
    return this;
  }

  public CoordinateModel build() {
    return new CoordinateModel(this.value);
  }
}
