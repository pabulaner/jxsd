package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LayoutModeModel;
import com.scell.model.drawingml.chart.LayoutModeValueModel;

public class LayoutModeBuilder {
  private LayoutModeValueModel val;

  public LayoutModeBuilder() {
  }

  public LayoutModeBuilder setVal(LayoutModeValueModel val) {
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
