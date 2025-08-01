package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.MarkerStyleModel;
import com.scell.model.drawingml.chart.MarkerStyleValueModel;

public class MarkerStyleBuilder {
  private MarkerStyleValueModel val;

  public MarkerStyleBuilder() {
  }

  public MarkerStyleBuilder setVal(MarkerStyleValueModel val) {
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
