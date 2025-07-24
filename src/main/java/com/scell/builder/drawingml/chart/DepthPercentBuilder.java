package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DepthPercentModel;

public class DepthPercentBuilder {
  private DepthPercentModel val;

  public DepthPercentBuilder() {
  }

  public DepthPercentBuilder setVal(DepthPercentModel val) {
    this.val = val;
    return this;
  }

  public DepthPercentModel build() {
    return new DepthPercentModel(this.val);
  }

  public DepthPercentBuilder from(DepthPercentModel value) {
    this.val = value.getVal();
    return this;
  }
}
