package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntValueModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;

public class UnsignedIntBuilder {
  private UnsignedIntValueModel val;

  public UnsignedIntBuilder() {
  }

  public UnsignedIntBuilder setVal(UnsignedIntValueModel val) {
    this.val = val;
    return this;
  }

  public UnsignedIntModel build() {
    return new UnsignedIntModel(this.val);
  }

  public UnsignedIntBuilder from(UnsignedIntModel value) {
    this.val = value.getVal();
    return this;
  }
}
