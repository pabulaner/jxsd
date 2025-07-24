package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.Coordinate32Model;

public class Coordinate32Builder {
  private int value;

  public Coordinate32Builder() {
  }

  public Coordinate32Builder setValue(int value) {
    this.value = value;
    return this;
  }

  public Coordinate32Builder from(Coordinate32Model value) {
    this.value = value.getValue();
    return this;
  }

  public Coordinate32Model build() {
    return new Coordinate32Model(this.value);
  }
}
