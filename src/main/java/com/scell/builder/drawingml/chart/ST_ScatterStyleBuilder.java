package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_ScatterStyleModel;

public class ST_ScatterStyleBuilder {
  private ST_ScatterStyleModel value;

  public ST_ScatterStyleBuilder() {
    this.value = null;
  }

  public ST_ScatterStyleBuilder from(ST_ScatterStyleModel value) {
    this.value = value;
    return this;
  }

  public ST_ScatterStyleModel build() {
    return this.value;
  }

  public ST_ScatterStyleBuilder setValue(ST_ScatterStyleModel value) {
    this.value = value;
    return this;
  }
}
