package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.HPercentModel;
import com.scell.model.drawingml.chart.HPercentValueModel;

public class HPercentBuilder {
  private HPercentValueModel val;

  public HPercentBuilder() {
  }

  public HPercentBuilder setVal(HPercentValueModel val) {
    this.val = val;
    return this;
  }

  public HPercentModel build() {
    return new HPercentModel(this.val);
  }

  public HPercentBuilder from(HPercentModel value) {
    this.val = value.getVal();
    return this;
  }
}
