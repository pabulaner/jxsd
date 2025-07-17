package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_HoleSizeModel;
import com.scell.model.drawingml.chart.ST_HoleSizeModel;

public class CT_HoleSizeBuilder {
  private ST_HoleSizeModel val;

  public CT_HoleSizeBuilder() {
  }

  public CT_HoleSizeBuilder setVal(ST_HoleSizeModel val) {
    this.val = val;
    return this;
  }

  public CT_HoleSizeModel build() {
    return new CT_HoleSizeModel(this.val);
  }

  public CT_HoleSizeBuilder from(CT_HoleSizeModel value) {
    this.val = value.getVal();
    return this;
  }
}
