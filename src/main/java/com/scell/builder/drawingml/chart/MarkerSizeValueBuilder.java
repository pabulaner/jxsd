package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.MarkerSizeValueModel;

public class MarkerSizeValueBuilder {
  private short value;

  public MarkerSizeValueBuilder() {
  }

  public MarkerSizeValueBuilder setValue(short value) {
    this.value = value;
    return this;
  }

  public MarkerSizeValueBuilder from(MarkerSizeValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public MarkerSizeValueModel build() {
    return new MarkerSizeValueModel(this.value);
  }
}
