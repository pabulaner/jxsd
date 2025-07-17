package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LblOffsetModel;
import com.scell.model.drawingml.chart.ST_LblOffsetModel;

public class CT_LblOffsetBuilder {
  private ST_LblOffsetModel val;

  public CT_LblOffsetBuilder() {
  }

  public CT_LblOffsetBuilder setVal(ST_LblOffsetModel val) {
    this.val = val;
    return this;
  }

  public CT_LblOffsetModel build() {
    return new CT_LblOffsetModel(this.val);
  }

  public CT_LblOffsetBuilder from(CT_LblOffsetModel value) {
    this.val = value.getVal();
    return this;
  }
}
