package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BarDirModel;
import com.scell.model.drawingml.chart.ST_BarDirModel;

public class CT_BarDirBuilder {
  private ST_BarDirModel val;

  public CT_BarDirBuilder() {
  }

  public CT_BarDirBuilder setVal(ST_BarDirModel val) {
    this.val = val;
    return this;
  }

  public CT_BarDirModel build() {
    return new CT_BarDirModel(this.val);
  }

  public CT_BarDirBuilder from(CT_BarDirModel value) {
    this.val = value.getVal();
    return this;
  }
}
