package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OverlapModel;
import com.scell.model.drawingml.chart.OverlapValueModel;

public class OverlapBuilder {
  private OverlapValueModel val;

  public OverlapBuilder() {
  }

  public OverlapBuilder setVal(OverlapValueModel val) {
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
