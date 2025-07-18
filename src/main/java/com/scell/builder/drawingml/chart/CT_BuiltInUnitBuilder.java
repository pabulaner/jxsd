package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BuiltInUnitModel;
import com.scell.model.drawingml.chart.ST_BuiltInUnitModel;

public class CT_BuiltInUnitBuilder {
  private ST_BuiltInUnitModel val;

  public CT_BuiltInUnitBuilder() {
  }

  public CT_BuiltInUnitBuilder setVal(ST_BuiltInUnitModel val) {
    this.val = val;
    return this;
  }

  public CT_BuiltInUnitModel build() {
    return new CT_BuiltInUnitModel(this.val);
  }

  public CT_BuiltInUnitBuilder from(CT_BuiltInUnitModel value) {
    this.val = value.getVal();
    return this;
  }
}
