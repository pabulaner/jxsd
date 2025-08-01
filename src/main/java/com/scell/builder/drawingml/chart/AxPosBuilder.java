package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxPosModel;
import com.scell.model.drawingml.chart.AxPosValueModel;

public class AxPosBuilder {
  private AxPosValueModel val;

  public AxPosBuilder() {
  }

  public AxPosBuilder setVal(AxPosValueModel val) {
    this.val = val;
    return this;
  }

  public AxPosModel build() {
    return new AxPosModel(this.val);
  }

  public AxPosBuilder from(AxPosModel value) {
    this.val = value.getVal();
    return this;
  }
}
