package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxisUnitModel;
import com.scell.model.drawingml.chart.ST_AxisUnitModel;

public class CT_AxisUnitBuilder {
  private ST_AxisUnitModel val;

  public CT_AxisUnitBuilder() {
  }

  public CT_AxisUnitBuilder setVal(ST_AxisUnitModel val) {
    this.val = val;
    return this;
  }

  public CT_AxisUnitModel build() {
    return new CT_AxisUnitModel(this.val);
  }

  public CT_AxisUnitBuilder from(CT_AxisUnitModel value) {
    this.val = value.getVal();
    return this;
  }
}
