package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateValueModel;

public class CoordinateValueBuilder {
  private long value;

  public CoordinateValueBuilder() {
  }

  public CoordinateValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public CoordinateValueBuilder from(CoordinateValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public CoordinateValueModel build() {
    return new CoordinateValueModel(this.value);
  }
}
