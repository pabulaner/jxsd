package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BuiltInUnitModel;

public class BuiltInUnitBuilder {
  private BuiltInUnitModel val;

  public BuiltInUnitBuilder() {
  }

  public BuiltInUnitBuilder setVal(BuiltInUnitModel val) {
    this.val = val;
    return this;
  }

  public BuiltInUnitModel build() {
    return new BuiltInUnitModel(this.val);
  }

  public BuiltInUnitBuilder from(BuiltInUnitModel value) {
    this.val = value.getVal();
    return this;
  }
}
