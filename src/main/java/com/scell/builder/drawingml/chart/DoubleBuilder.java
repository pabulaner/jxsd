package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.DoubleModel;

public class DoubleBuilder {
  private DoubleModel val;

  public DoubleBuilder() {
  }

  public DoubleBuilder setVal(DoubleModel val) {
    this.val = val;
    return this;
  }

  public com.scell.model.drawingml.chart.DoubleModel build() {
    return new com.scell.model.drawingml.chart.DoubleModel(this.val);
  }

  public DoubleBuilder from(com.scell.model.drawingml.chart.DoubleModel value) {
    this.val = value.getVal();
    return this;
  }
}
