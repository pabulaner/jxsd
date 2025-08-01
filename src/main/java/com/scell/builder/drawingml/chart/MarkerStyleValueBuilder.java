package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.MarkerStyleValueModel;

public class MarkerStyleValueBuilder {
  private MarkerStyleValueModel value;

  public MarkerStyleValueBuilder() {
    this.value = null;
  }

  public MarkerStyleValueBuilder from(MarkerStyleValueModel value) {
    this.value = value;
    return this;
  }

  public MarkerStyleValueModel build() {
    return this.value;
  }

  public MarkerStyleValueBuilder setValue(MarkerStyleValueModel value) {
    this.value = value;
    return this;
  }
}
