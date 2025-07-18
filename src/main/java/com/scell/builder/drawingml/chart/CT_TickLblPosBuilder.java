package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_TickLblPosModel;
import com.scell.model.drawingml.chart.ST_TickLblPosModel;

public class CT_TickLblPosBuilder {
  private ST_TickLblPosModel val;

  public CT_TickLblPosBuilder() {
  }

  public CT_TickLblPosBuilder setVal(ST_TickLblPosModel val) {
    this.val = val;
    return this;
  }

  public CT_TickLblPosModel build() {
    return new CT_TickLblPosModel(this.val);
  }

  public CT_TickLblPosBuilder from(CT_TickLblPosModel value) {
    this.val = value.getVal();
    return this;
  }
}
