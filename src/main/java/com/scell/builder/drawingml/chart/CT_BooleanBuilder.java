package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;

public class CT_BooleanBuilder {
  private BooleanModel val;

  public CT_BooleanBuilder() {
  }

  public CT_BooleanBuilder setVal(BooleanModel val) {
    this.val = val;
    return this;
  }

  public CT_BooleanModel build() {
    return new CT_BooleanModel(this.val);
  }

  public CT_BooleanBuilder from(CT_BooleanModel value) {
    this.val = value.getVal();
    return this;
  }
}
