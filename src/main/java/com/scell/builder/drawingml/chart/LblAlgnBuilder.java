package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LblAlgnModel;

public class LblAlgnBuilder {
  private LblAlgnModel val;

  public LblAlgnBuilder() {
  }

  public LblAlgnBuilder setVal(LblAlgnModel val) {
    this.val = val;
    return this;
  }

  public LblAlgnModel build() {
    return new LblAlgnModel(this.val);
  }

  public LblAlgnBuilder from(LblAlgnModel value) {
    this.val = value.getVal();
    return this;
  }
}
