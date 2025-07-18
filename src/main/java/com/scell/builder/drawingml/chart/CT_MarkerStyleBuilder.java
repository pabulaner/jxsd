package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_MarkerStyleModel;
import com.scell.model.drawingml.chart.ST_MarkerStyleModel;

public class CT_MarkerStyleBuilder {
  private ST_MarkerStyleModel val;

  public CT_MarkerStyleBuilder() {
  }

  public CT_MarkerStyleBuilder setVal(ST_MarkerStyleModel val) {
    this.val = val;
    return this;
  }

  public CT_MarkerStyleModel build() {
    return new CT_MarkerStyleModel(this.val);
  }

  public CT_MarkerStyleBuilder from(CT_MarkerStyleModel value) {
    this.val = value.getVal();
    return this;
  }
}
