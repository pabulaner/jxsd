package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.DoubleValueModel;
import com.scell.model.drawingml.chart.DoubleModel;

public class DoubleBuilder {
  private DoubleValueModel val;

  public DoubleBuilder() {
  }

  public DoubleBuilder setVal(DoubleValueModel val) {
    this.val = val;
    return this;
  }

  public DoubleModel build() {
    return new DoubleModel(this.val);
  }

  public DoubleBuilder from(DoubleModel value) {
    this.val = value.getVal();
    return this;
  }
}
