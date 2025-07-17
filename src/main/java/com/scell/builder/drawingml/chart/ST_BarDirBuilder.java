package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_BarDirModel;

public class ST_BarDirBuilder {
  private ST_BarDirModel value;

  public ST_BarDirBuilder() {
    this.value = null;
  }

  public ST_BarDirBuilder from(ST_BarDirModel value) {
    this.value = value;
    return this;
  }

  public ST_BarDirModel build() {
    return this.value;
  }

  public ST_BarDirBuilder setValue(ST_BarDirModel value) {
    this.value = value;
    return this;
  }
}
