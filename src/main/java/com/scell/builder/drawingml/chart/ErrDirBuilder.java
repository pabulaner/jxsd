package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ErrDirModel;
import com.scell.model.drawingml.chart.ErrDirValueModel;

public class ErrDirBuilder {
  private ErrDirValueModel val;

  public ErrDirBuilder() {
  }

  public ErrDirBuilder setVal(ErrDirValueModel val) {
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
