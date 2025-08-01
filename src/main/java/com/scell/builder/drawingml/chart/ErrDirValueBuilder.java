package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ErrDirValueModel;

public class ErrDirValueBuilder {
  private ErrDirValueModel value;

  public ErrDirValueBuilder() {
    this.value = null;
  }

  public ErrDirValueBuilder from(ErrDirValueModel value) {
    this.value = value;
    return this;
  }

  public ErrDirValueModel build() {
    return this.value;
  }

  public ErrDirValueBuilder setValue(ErrDirValueModel value) {
    this.value = value;
    return this;
  }
}
