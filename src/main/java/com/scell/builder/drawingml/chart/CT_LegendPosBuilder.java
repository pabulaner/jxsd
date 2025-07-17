package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LegendPosModel;
import com.scell.model.drawingml.chart.ST_LegendPosModel;

public class CT_LegendPosBuilder {
  private ST_LegendPosModel val;

  public CT_LegendPosBuilder() {
  }

  public CT_LegendPosBuilder setVal(ST_LegendPosModel val) {
    this.val = val;
    return this;
  }

  public CT_LegendPosModel build() {
    return new CT_LegendPosModel(this.val);
  }

  public CT_LegendPosBuilder from(CT_LegendPosModel value) {
    this.val = value.getVal();
    return this;
  }
}
