package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ErrDirModel;
import com.scell.model.drawingml.chart.ST_ErrDirModel;

public class CT_ErrDirBuilder {
  private ST_ErrDirModel val;

  public CT_ErrDirBuilder() {
  }

  public CT_ErrDirBuilder setVal(ST_ErrDirModel val) {
    this.val = val;
    return this;
  }

  public CT_ErrDirModel build() {
    return new CT_ErrDirModel(this.val);
  }

  public CT_ErrDirBuilder from(CT_ErrDirModel value) {
    this.val = value.getVal();
    return this;
  }
}
