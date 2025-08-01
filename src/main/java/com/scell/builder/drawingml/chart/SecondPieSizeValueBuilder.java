package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SecondPieSizeValueModel;

public class SecondPieSizeValueBuilder {
  private int value;

  public SecondPieSizeValueBuilder() {
  }

  public SecondPieSizeValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public SecondPieSizeValueBuilder from(SecondPieSizeValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public SecondPieSizeValueModel build() {
    return new SecondPieSizeValueModel(this.value);
  }
}
