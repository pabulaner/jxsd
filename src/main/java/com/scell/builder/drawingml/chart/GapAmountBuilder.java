package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.GapAmountModel;
import com.scell.model.drawingml.chart.GapAmountValueModel;

public class GapAmountBuilder {
  private GapAmountValueModel val;

  public GapAmountBuilder() {
  }

  public GapAmountBuilder setVal(GapAmountValueModel val) {
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
