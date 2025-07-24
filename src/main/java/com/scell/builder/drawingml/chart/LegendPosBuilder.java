package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LegendPosModel;

public class LegendPosBuilder {
  private LegendPosModel val;

  public LegendPosBuilder() {
  }

  public LegendPosBuilder setVal(LegendPosModel val) {
    this.val = val;
    return this;
  }

  public LegendPosModel build() {
    return new LegendPosModel(this.val);
  }

  public LegendPosBuilder from(LegendPosModel value) {
    this.val = value.getVal();
    return this;
  }
}
