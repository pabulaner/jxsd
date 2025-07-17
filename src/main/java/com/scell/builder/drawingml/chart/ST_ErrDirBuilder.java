package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_ErrDirModel;

public class ST_ErrDirBuilder {
  private ST_ErrDirModel value;

  public ST_ErrDirBuilder() {
    this.value = null;
  }

  public ST_ErrDirBuilder from(ST_ErrDirModel value) {
    this.value = value;
    return this;
  }

  public ST_ErrDirModel build() {
    return this.value;
  }

  public ST_ErrDirBuilder setValue(ST_ErrDirModel value) {
    this.value = value;
    return this;
  }
}
