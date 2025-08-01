package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SplitTypeModel;
import com.scell.model.drawingml.chart.SplitTypeValueModel;

public class SplitTypeBuilder {
  private SplitTypeValueModel val;

  public SplitTypeBuilder() {
  }

  public SplitTypeBuilder setVal(SplitTypeValueModel val) {
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
