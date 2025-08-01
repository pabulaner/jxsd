package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.FirstSliceAngModel;
import com.scell.model.drawingml.chart.FirstSliceAngValueModel;

public class FirstSliceAngBuilder {
  private FirstSliceAngValueModel val;

  public FirstSliceAngBuilder() {
  }

  public FirstSliceAngBuilder setVal(FirstSliceAngValueModel val) {
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
