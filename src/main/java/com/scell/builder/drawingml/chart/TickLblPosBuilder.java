package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TickLblPosModel;
import com.scell.model.drawingml.chart.TickLblPosValueModel;

public class TickLblPosBuilder {
  private TickLblPosValueModel val;

  public TickLblPosBuilder() {
  }

  public TickLblPosBuilder setVal(TickLblPosValueModel val) {
    this.val = val;
    return this;
  }

  public TickLblPosModel build() {
    return new TickLblPosModel(this.val);
  }

  public TickLblPosBuilder from(TickLblPosModel value) {
    this.val = value.getVal();
    return this;
  }
}
