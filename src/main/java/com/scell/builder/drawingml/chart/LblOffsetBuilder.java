package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LblOffsetModel;
import com.scell.model.drawingml.chart.LblOffsetValueModel;

public class LblOffsetBuilder {
  private LblOffsetValueModel val;

  public LblOffsetBuilder() {
  }

  public LblOffsetBuilder setVal(LblOffsetValueModel val) {
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
