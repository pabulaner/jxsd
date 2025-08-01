package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.Coordinate32ValueModel;

public class Coordinate32ValueBuilder {
  private int value;

  public Coordinate32ValueBuilder() {
  }

  public Coordinate32ValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public Coordinate32ValueBuilder from(Coordinate32ValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public Coordinate32ValueModel build() {
    return new Coordinate32ValueModel(this.value);
  }
}
