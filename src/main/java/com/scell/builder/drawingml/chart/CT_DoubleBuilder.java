package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.DoubleModel;
import com.scell.model.drawingml.chart.CT_DoubleModel;

public class CT_DoubleBuilder {
  private DoubleModel val;

  public CT_DoubleBuilder() {
  }

  public CT_DoubleBuilder setVal(DoubleModel val) {
    this.val = val;
    return this;
  }

  public CT_DoubleModel build() {
    return new CT_DoubleModel(this.val);
  }

  public CT_DoubleBuilder from(CT_DoubleModel value) {
    this.val = value.getVal();
    return this;
  }
}
