package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SplitTypeModel;

public class SplitTypeBuilder {
  private SplitTypeModel val;

  public SplitTypeBuilder() {
  }

  public SplitTypeBuilder setVal(SplitTypeModel val) {
    this.val = val;
    return this;
  }

  public SplitTypeModel build() {
    return new SplitTypeModel(this.val);
  }

  public SplitTypeBuilder from(SplitTypeModel value) {
    this.val = value.getVal();
    return this;
  }
}
