package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LegendPosModel;
import com.scell.model.drawingml.chart.LegendPosValueModel;

public class LegendPosBuilder {
  private LegendPosValueModel val;

  public LegendPosBuilder() {
  }

  public LegendPosBuilder setVal(LegendPosValueModel val) {
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
