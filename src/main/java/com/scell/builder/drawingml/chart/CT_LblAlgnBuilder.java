package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LblAlgnModel;
import com.scell.model.drawingml.chart.ST_LblAlgnModel;

public class CT_LblAlgnBuilder {
  private ST_LblAlgnModel val;

  public CT_LblAlgnBuilder() {
  }

  public CT_LblAlgnBuilder setVal(ST_LblAlgnModel val) {
    this.val = val;
    return this;
  }

  public CT_LblAlgnModel build() {
    return new CT_LblAlgnModel(this.val);
  }

  public CT_LblAlgnBuilder from(CT_LblAlgnModel value) {
    this.val = value.getVal();
    return this;
  }
}
