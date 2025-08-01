package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LblAlgnModel;
import com.scell.model.drawingml.chart.LblAlgnValueModel;

public class LblAlgnBuilder {
  private LblAlgnValueModel val;

  public LblAlgnBuilder() {
  }

  public LblAlgnBuilder setVal(LblAlgnValueModel val) {
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
