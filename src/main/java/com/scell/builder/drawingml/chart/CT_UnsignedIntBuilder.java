package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;

public class CT_UnsignedIntBuilder {
  private UnsignedIntModel val;

  public CT_UnsignedIntBuilder() {
  }

  public CT_UnsignedIntBuilder setVal(UnsignedIntModel val) {
    this.val = val;
    return this;
  }

  public CT_UnsignedIntModel build() {
    return new CT_UnsignedIntModel(this.val);
  }

  public CT_UnsignedIntBuilder from(CT_UnsignedIntModel value) {
    this.val = value.getVal();
    return this;
  }
}
