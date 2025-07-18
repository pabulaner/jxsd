package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_RotXModel;
import com.scell.model.drawingml.chart.ST_RotXModel;

public class CT_RotXBuilder {
  private ST_RotXModel val;

  public CT_RotXBuilder() {
  }

  public CT_RotXBuilder setVal(ST_RotXModel val) {
    this.val = val;
    return this;
  }

  public CT_RotXModel build() {
    return new CT_RotXModel(this.val);
  }

  public CT_RotXBuilder from(CT_RotXModel value) {
    this.val = value.getVal();
    return this;
  }
}
