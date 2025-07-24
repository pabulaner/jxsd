package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LayoutModeModel;

public class LayoutModeBuilder {
  private LayoutModeModel val;

  public LayoutModeBuilder() {
  }

  public LayoutModeBuilder setVal(LayoutModeModel val) {
    this.val = val;
    return this;
  }

  public LayoutModeModel build() {
    return new LayoutModeModel(this.val);
  }

  public LayoutModeBuilder from(LayoutModeModel value) {
    this.val = value.getVal();
    return this;
  }
}
