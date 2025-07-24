package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.MarkerStyleModel;

public class MarkerStyleBuilder {
  private MarkerStyleModel val;

  public MarkerStyleBuilder() {
  }

  public MarkerStyleBuilder setVal(MarkerStyleModel val) {
    this.val = val;
    return this;
  }

  public MarkerStyleModel build() {
    return new MarkerStyleModel(this.val);
  }

  public MarkerStyleBuilder from(MarkerStyleModel value) {
    this.val = value.getVal();
    return this;
  }
}
