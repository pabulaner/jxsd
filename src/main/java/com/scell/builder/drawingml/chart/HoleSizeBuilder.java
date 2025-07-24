package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.HoleSizeModel;

public class HoleSizeBuilder {
  private HoleSizeModel val;

  public HoleSizeBuilder() {
  }

  public HoleSizeBuilder setVal(HoleSizeModel val) {
    this.val = val;
    return this;
  }

  public HoleSizeModel build() {
    return new HoleSizeModel(this.val);
  }

  public HoleSizeBuilder from(HoleSizeModel value) {
    this.val = value.getVal();
    return this;
  }
}
