package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.HPercentModel;

public class HPercentBuilder {
  private HPercentModel val;

  public HPercentBuilder() {
  }

  public HPercentBuilder setVal(HPercentModel val) {
    this.val = val;
    return this;
  }

  public HPercentModel build() {
    return new HPercentModel(this.val);
  }

  public HPercentBuilder from(HPercentModel value) {
    this.val = value.getVal();
    return this;
  }
}
