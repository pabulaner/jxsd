package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxisUnitModel;
import com.scell.model.drawingml.chart.AxisUnitValueModel;

public class AxisUnitBuilder {
  private AxisUnitValueModel val;

  public AxisUnitBuilder() {
  }

  public AxisUnitBuilder setVal(AxisUnitValueModel val) {
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
