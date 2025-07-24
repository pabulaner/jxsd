package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OverlapModel;

public class OverlapBuilder {
  private OverlapModel val;

  public OverlapBuilder() {
  }

  public OverlapBuilder setVal(OverlapModel val) {
    this.val = val;
    return this;
  }

  public OverlapModel build() {
    return new OverlapModel(this.val);
  }

  public OverlapBuilder from(OverlapModel value) {
    this.val = value.getVal();
    return this;
  }
}
