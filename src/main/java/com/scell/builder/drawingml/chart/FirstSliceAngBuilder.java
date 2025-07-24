package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.FirstSliceAngModel;

public class FirstSliceAngBuilder {
  private FirstSliceAngModel val;

  public FirstSliceAngBuilder() {
  }

  public FirstSliceAngBuilder setVal(FirstSliceAngModel val) {
    this.val = val;
    return this;
  }

  public FirstSliceAngModel build() {
    return new FirstSliceAngModel(this.val);
  }

  public FirstSliceAngBuilder from(FirstSliceAngModel value) {
    this.val = value.getVal();
    return this;
  }
}
