package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ErrDirModel;

public class ErrDirBuilder {
  private ErrDirModel val;

  public ErrDirBuilder() {
  }

  public ErrDirBuilder setVal(ErrDirModel val) {
    this.val = val;
    return this;
  }

  public ErrDirModel build() {
    return new ErrDirModel(this.val);
  }

  public ErrDirBuilder from(ErrDirModel value) {
    this.val = value.getVal();
    return this;
  }
}
