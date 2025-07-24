package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxPosModel;

public class AxPosBuilder {
  private AxPosModel val;

  public AxPosBuilder() {
  }

  public AxPosBuilder setVal(AxPosModel val) {
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
