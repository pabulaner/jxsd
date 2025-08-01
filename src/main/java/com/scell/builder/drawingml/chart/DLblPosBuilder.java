package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DLblPosModel;
import com.scell.model.drawingml.chart.DLblPosValueModel;

public class DLblPosBuilder {
  private DLblPosValueModel val;

  public DLblPosBuilder() {
  }

  public DLblPosBuilder setVal(DLblPosValueModel val) {
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
