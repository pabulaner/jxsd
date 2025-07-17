package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_MarkerStyleModel;

public class ST_MarkerStyleBuilder {
  private ST_MarkerStyleModel value;

  public ST_MarkerStyleBuilder() {
    this.value = null;
  }

  public ST_MarkerStyleBuilder from(ST_MarkerStyleModel value) {
    this.value = value;
    return this;
  }

  public ST_MarkerStyleModel build() {
    return this.value;
  }

  public ST_MarkerStyleBuilder setValue(ST_MarkerStyleModel value) {
    this.value = value;
    return this;
  }
}
