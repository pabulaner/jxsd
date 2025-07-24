package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LayoutTargetModel;

public class LayoutTargetBuilder {
  private LayoutTargetModel val;

  public LayoutTargetBuilder() {
  }

  public LayoutTargetBuilder setVal(LayoutTargetModel val) {
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
