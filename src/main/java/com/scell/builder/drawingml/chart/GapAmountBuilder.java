package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.GapAmountModel;

public class GapAmountBuilder {
  private GapAmountModel val;

  public GapAmountBuilder() {
  }

  public GapAmountBuilder setVal(GapAmountModel val) {
    this.val = val;
    return this;
  }

  public GapAmountModel build() {
    return new GapAmountModel(this.val);
  }

  public GapAmountBuilder from(GapAmountModel value) {
    this.val = value.getVal();
    return this;
  }
}
