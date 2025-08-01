package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.HoleSizeModel;
import com.scell.model.drawingml.chart.HoleSizeValueModel;

public class HoleSizeBuilder {
  private HoleSizeValueModel val;

  public HoleSizeBuilder() {
  }

  public HoleSizeBuilder setVal(HoleSizeValueModel val) {
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
