package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ScatterStyleModel;

public class ScatterStyleBuilder {
  private ScatterStyleModel val;

  public ScatterStyleBuilder() {
  }

  public ScatterStyleBuilder setVal(ScatterStyleModel val) {
    this.val = val;
    return this;
  }

  public ScatterStyleModel build() {
    return new ScatterStyleModel(this.val);
  }

  public ScatterStyleBuilder from(ScatterStyleModel value) {
    this.val = value.getVal();
    return this;
  }
}
