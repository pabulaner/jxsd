package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LayoutModeModel;

public class ST_LayoutModeBuilder {
  private ST_LayoutModeModel value;

  public ST_LayoutModeBuilder() {
    this.value = null;
  }

  public ST_LayoutModeBuilder from(ST_LayoutModeModel value) {
    this.value = value;
    return this;
  }

  public ST_LayoutModeModel build() {
    return this.value;
  }

  public ST_LayoutModeBuilder setValue(ST_LayoutModeModel value) {
    this.value = value;
    return this;
  }
}
