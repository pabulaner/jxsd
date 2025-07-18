package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_TimeUnitModel;
import com.scell.model.drawingml.chart.ST_TimeUnitModel;

public class CT_TimeUnitBuilder {
  private ST_TimeUnitModel val;

  public CT_TimeUnitBuilder() {
  }

  public CT_TimeUnitBuilder setVal(ST_TimeUnitModel val) {
    this.val = val;
    return this;
  }

  public CT_TimeUnitModel build() {
    return new CT_TimeUnitModel(this.val);
  }

  public CT_TimeUnitBuilder from(CT_TimeUnitModel value) {
    this.val = value.getVal();
    return this;
  }
}
