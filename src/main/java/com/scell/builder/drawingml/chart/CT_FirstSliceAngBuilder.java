package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_FirstSliceAngModel;
import com.scell.model.drawingml.chart.ST_FirstSliceAngModel;

public class CT_FirstSliceAngBuilder {
  private ST_FirstSliceAngModel val;

  public CT_FirstSliceAngBuilder() {
  }

  public CT_FirstSliceAngBuilder setVal(ST_FirstSliceAngModel val) {
    this.val = val;
    return this;
  }

  public CT_FirstSliceAngModel build() {
    return new CT_FirstSliceAngModel(this.val);
  }

  public CT_FirstSliceAngBuilder from(CT_FirstSliceAngModel value) {
    this.val = value.getVal();
    return this;
  }
}
