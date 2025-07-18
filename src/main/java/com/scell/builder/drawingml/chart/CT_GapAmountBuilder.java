package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_GapAmountModel;
import com.scell.model.drawingml.chart.ST_GapAmountModel;

public class CT_GapAmountBuilder {
  private ST_GapAmountModel val;

  public CT_GapAmountBuilder() {
  }

  public CT_GapAmountBuilder setVal(ST_GapAmountModel val) {
    this.val = val;
    return this;
  }

  public CT_GapAmountModel build() {
    return new CT_GapAmountModel(this.val);
  }

  public CT_GapAmountBuilder from(CT_GapAmountModel value) {
    this.val = value.getVal();
    return this;
  }
}
