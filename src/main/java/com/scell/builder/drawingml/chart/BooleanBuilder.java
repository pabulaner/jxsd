package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.chart.BooleanModel;

public class BooleanBuilder {
  private BooleanValueModel val;

  public BooleanBuilder() {
  }

  public BooleanBuilder setVal(BooleanValueModel val) {
    this.val = val;
    return this;
  }

  public BooleanModel build() {
    return new BooleanModel(this.val);
  }

  public BooleanBuilder from(BooleanModel value) {
    this.val = value.getVal();
    return this;
  }
}
