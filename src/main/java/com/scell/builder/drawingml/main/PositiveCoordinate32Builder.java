package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveCoordinate32Model;

public class PositiveCoordinate32Builder {
  private int value;

  public PositiveCoordinate32Builder() {
  }

  public PositiveCoordinate32Builder setValue(int value) {
    this.value = value;
    return this;
  }

  public PositiveCoordinate32Builder from(PositiveCoordinate32Model value) {
    this.value = value.getValue();
    return this;
  }

  public PositiveCoordinate32Model build() {
    return new PositiveCoordinate32Model(this.value);
  }
}
