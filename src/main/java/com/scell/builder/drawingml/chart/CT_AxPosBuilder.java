package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxPosModel;
import com.scell.model.drawingml.chart.ST_AxPosModel;

public class CT_AxPosBuilder {
  private ST_AxPosModel val;

  public CT_AxPosBuilder() {
  }

  public CT_AxPosBuilder setVal(ST_AxPosModel val) {
    this.val = val;
    return this;
  }

  public CT_AxPosModel build() {
    return new CT_AxPosModel(this.val);
  }

  public CT_AxPosBuilder from(CT_AxPosModel value) {
    this.val = value.getVal();
    return this;
  }
}
