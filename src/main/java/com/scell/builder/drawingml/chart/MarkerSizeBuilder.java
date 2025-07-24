package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.MarkerSizeModel;

public class MarkerSizeBuilder {
  private MarkerSizeModel val;

  public MarkerSizeBuilder() {
  }

  public MarkerSizeBuilder setVal(MarkerSizeModel val) {
    this.val = val;
    return this;
  }

  public MarkerSizeModel build() {
    return new MarkerSizeModel(this.val);
  }

  public MarkerSizeBuilder from(MarkerSizeModel value) {
    this.val = value.getVal();
    return this;
  }
}
