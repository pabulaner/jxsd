package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_HPercentModel;
import com.scell.model.drawingml.chart.ST_HPercentModel;

public class CT_HPercentBuilder {
  private ST_HPercentModel val;

  public CT_HPercentBuilder() {
  }

  public CT_HPercentBuilder setVal(ST_HPercentModel val) {
    this.val = val;
    return this;
  }

  public CT_HPercentModel build() {
    return new CT_HPercentModel(this.val);
  }

  public CT_HPercentBuilder from(CT_HPercentModel value) {
    this.val = value.getVal();
    return this;
  }
}
