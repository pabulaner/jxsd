package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BuiltInUnitModel;
import com.scell.model.drawingml.chart.BuiltInUnitValueModel;

public class BuiltInUnitBuilder {
  private BuiltInUnitValueModel val;

  public BuiltInUnitBuilder() {
  }

  public BuiltInUnitBuilder setVal(BuiltInUnitValueModel val) {
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
