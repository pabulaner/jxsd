package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_RotYModel;
import com.scell.model.drawingml.chart.ST_RotYModel;

public class CT_RotYBuilder {
  private ST_RotYModel val;

  public CT_RotYBuilder() {
  }

  public CT_RotYBuilder setVal(ST_RotYModel val) {
    this.val = val;
    return this;
  }

  public CT_RotYModel build() {
    return new CT_RotYModel(this.val);
  }

  public CT_RotYBuilder from(CT_RotYModel value) {
    this.val = value.getVal();
    return this;
  }
}
