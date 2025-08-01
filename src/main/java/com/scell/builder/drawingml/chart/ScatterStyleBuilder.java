package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ScatterStyleModel;
import com.scell.model.drawingml.chart.ScatterStyleValueModel;

public class ScatterStyleBuilder {
  private ScatterStyleValueModel val;

  public ScatterStyleBuilder() {
  }

  public ScatterStyleBuilder setVal(ScatterStyleValueModel val) {
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
