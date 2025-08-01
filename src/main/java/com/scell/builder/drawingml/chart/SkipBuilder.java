package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SkipModel;
import com.scell.model.drawingml.chart.SkipValueModel;

public class SkipBuilder {
  private SkipValueModel val;

  public SkipBuilder() {
  }

  public SkipBuilder setVal(SkipValueModel val) {
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
