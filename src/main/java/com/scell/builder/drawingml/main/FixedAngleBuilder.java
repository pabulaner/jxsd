package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FixedAngleModel;

public class FixedAngleBuilder {
  private int value;

  public FixedAngleBuilder() {
  }

  public FixedAngleBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public FixedAngleBuilder from(FixedAngleModel value) {
    this.value = value.getValue();
    return this;
  }

  public FixedAngleModel build() {
    return new FixedAngleModel(this.value);
  }
}
