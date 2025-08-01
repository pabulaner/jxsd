package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BarDirModel;
import com.scell.model.drawingml.chart.BarDirValueModel;

public class BarDirBuilder {
  private BarDirValueModel val;

  public BarDirBuilder() {
  }

  public BarDirBuilder setVal(BarDirValueModel val) {
    this.val = val;
    return this;
  }

  public BarDirModel build() {
    return new BarDirModel(this.val);
  }

  public BarDirBuilder from(BarDirModel value) {
    this.val = value.getVal();
    return this;
  }
}
