package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxisUnitModel;

public class AxisUnitBuilder {
  private AxisUnitModel val;

  public AxisUnitBuilder() {
  }

  public AxisUnitBuilder setVal(AxisUnitModel val) {
    this.val = val;
    return this;
  }

  public AxisUnitModel build() {
    return new AxisUnitModel(this.val);
  }

  public AxisUnitBuilder from(AxisUnitModel value) {
    this.val = value.getVal();
    return this;
  }
}
