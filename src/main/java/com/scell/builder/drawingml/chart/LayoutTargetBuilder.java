package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LayoutTargetModel;
import com.scell.model.drawingml.chart.LayoutTargetValueModel;

public class LayoutTargetBuilder {
  private LayoutTargetValueModel val;

  public LayoutTargetBuilder() {
  }

  public LayoutTargetBuilder setVal(LayoutTargetValueModel val) {
    this.val = val;
    return this;
  }

  public LayoutTargetModel build() {
    return new LayoutTargetModel(this.val);
  }

  public LayoutTargetBuilder from(LayoutTargetModel value) {
    this.val = value.getVal();
    return this;
  }
}
