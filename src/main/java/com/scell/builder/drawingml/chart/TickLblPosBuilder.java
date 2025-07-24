package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TickLblPosModel;

public class TickLblPosBuilder {
  private TickLblPosModel val;

  public TickLblPosBuilder() {
  }

  public TickLblPosBuilder setVal(TickLblPosModel val) {
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
