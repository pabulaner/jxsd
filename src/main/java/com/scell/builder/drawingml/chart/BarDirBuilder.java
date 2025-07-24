package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BarDirModel;

public class BarDirBuilder {
  private BarDirModel val;

  public BarDirBuilder() {
  }

  public BarDirBuilder setVal(BarDirModel val) {
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
