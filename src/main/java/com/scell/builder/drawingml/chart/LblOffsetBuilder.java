package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LblOffsetModel;

public class LblOffsetBuilder {
  private LblOffsetModel val;

  public LblOffsetBuilder() {
  }

  public LblOffsetBuilder setVal(LblOffsetModel val) {
    this.val = val;
    return this;
  }

  public LblOffsetModel build() {
    return new LblOffsetModel(this.val);
  }

  public LblOffsetBuilder from(LblOffsetModel value) {
    this.val = value.getVal();
    return this;
  }
}
