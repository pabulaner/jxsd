package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntModel;

public class UnsignedIntBuilder {
  private UnsignedIntModel val;

  public UnsignedIntBuilder() {
  }

  public UnsignedIntBuilder setVal(UnsignedIntModel val) {
    this.val = val;
    return this;
  }

  public com.scell.model.drawingml.chart.UnsignedIntModel build() {
    return new com.scell.model.drawingml.chart.UnsignedIntModel(this.val);
  }

  public UnsignedIntBuilder from(com.scell.model.drawingml.chart.UnsignedIntModel value) {
    this.val = value.getVal();
    return this;
  }
}
