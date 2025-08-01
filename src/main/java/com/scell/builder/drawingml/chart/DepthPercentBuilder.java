package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DepthPercentModel;
import com.scell.model.drawingml.chart.DepthPercentValueModel;

public class DepthPercentBuilder {
  private DepthPercentValueModel val;

  public DepthPercentBuilder() {
  }

  public DepthPercentBuilder setVal(DepthPercentValueModel val) {
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
