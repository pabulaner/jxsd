package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ScatterStyleModel;
import com.scell.model.drawingml.chart.ST_ScatterStyleModel;

public class CT_ScatterStyleBuilder {
  private ST_ScatterStyleModel val;

  public CT_ScatterStyleBuilder() {
  }

  public CT_ScatterStyleBuilder setVal(ST_ScatterStyleModel val) {
    this.val = val;
    return this;
  }

  public CT_ScatterStyleModel build() {
    return new CT_ScatterStyleModel(this.val);
  }

  public CT_ScatterStyleBuilder from(CT_ScatterStyleModel value) {
    this.val = value.getVal();
    return this;
  }
}
