package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedAngleModel;

public class PositiveFixedAngleBuilder {
  private PositiveFixedAngleModel val;

  public PositiveFixedAngleBuilder() {
  }

  public PositiveFixedAngleBuilder setVal(PositiveFixedAngleModel val) {
    this.val = val;
    return this;
  }

  public PositiveFixedAngleModel build() {
    return new PositiveFixedAngleModel(this.val);
  }

  public PositiveFixedAngleBuilder from(PositiveFixedAngleModel value) {
    this.val = value.getVal();
    return this;
  }
}
