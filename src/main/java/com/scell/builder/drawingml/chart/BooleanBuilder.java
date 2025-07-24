package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;

public class BooleanBuilder {
  private BooleanModel val;

  public BooleanBuilder() {
  }

  public BooleanBuilder setVal(BooleanModel val) {
    this.val = val;
    return this;
  }

  public com.scell.model.drawingml.chart.BooleanModel build() {
    return new com.scell.model.drawingml.chart.BooleanModel(this.val);
  }

  public BooleanBuilder from(com.scell.model.drawingml.chart.BooleanModel value) {
    this.val = value.getVal();
    return this;
  }
}
