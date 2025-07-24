package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SkipModel;

public class SkipBuilder {
  private SkipModel val;

  public SkipBuilder() {
  }

  public SkipBuilder setVal(SkipModel val) {
    this.val = val;
    return this;
  }

  public SkipModel build() {
    return new SkipModel(this.val);
  }

  public SkipBuilder from(SkipModel value) {
    this.val = value.getVal();
    return this;
  }
}
