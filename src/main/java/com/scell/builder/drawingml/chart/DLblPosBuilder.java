package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DLblPosModel;

public class DLblPosBuilder {
  private DLblPosModel val;

  public DLblPosBuilder() {
  }

  public DLblPosBuilder setVal(DLblPosModel val) {
    this.val = val;
    return this;
  }

  public DLblPosModel build() {
    return new DLblPosModel(this.val);
  }

  public DLblPosBuilder from(DLblPosModel value) {
    this.val = value.getVal();
    return this;
  }
}
