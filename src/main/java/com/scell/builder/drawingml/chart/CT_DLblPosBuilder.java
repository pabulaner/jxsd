package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DLblPosModel;
import com.scell.model.drawingml.chart.ST_DLblPosModel;

public class CT_DLblPosBuilder {
  private ST_DLblPosModel val;

  public CT_DLblPosBuilder() {
  }

  public CT_DLblPosBuilder setVal(ST_DLblPosModel val) {
    this.val = val;
    return this;
  }

  public CT_DLblPosModel build() {
    return new CT_DLblPosModel(this.val);
  }

  public CT_DLblPosBuilder from(CT_DLblPosModel value) {
    this.val = value.getVal();
    return this;
  }
}
