package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LogBaseModel;
import com.scell.model.drawingml.chart.ST_LogBaseModel;

public class CT_LogBaseBuilder {
  private ST_LogBaseModel val;

  public CT_LogBaseBuilder() {
  }

  public CT_LogBaseBuilder setVal(ST_LogBaseModel val) {
    this.val = val;
    return this;
  }

  public CT_LogBaseModel build() {
    return new CT_LogBaseModel(this.val);
  }

  public CT_LogBaseBuilder from(CT_LogBaseModel value) {
    this.val = value.getVal();
    return this;
  }
}
