package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.MarkerSizeModel;
import com.scell.model.drawingml.chart.MarkerSizeValueModel;

public class MarkerSizeBuilder {
  private MarkerSizeValueModel val;

  public MarkerSizeBuilder() {
  }

  public MarkerSizeBuilder setVal(MarkerSizeValueModel val) {
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
