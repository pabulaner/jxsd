package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedAngleModel;
import com.scell.model.drawingml.main.PositiveFixedAngleValueModel;

public class PositiveFixedAngleBuilder {
  private PositiveFixedAngleValueModel val;

  public PositiveFixedAngleBuilder() {
  }

  public PositiveFixedAngleBuilder setVal(PositiveFixedAngleValueModel val) {
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
