package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ShapeValueModel;

public class ShapeValueBuilder {
  private ShapeValueModel value;

  public ShapeValueBuilder() {
    this.value = null;
  }

  public ShapeValueBuilder from(ShapeValueModel value) {
    this.value = value;
    return this;
  }

  public ShapeValueModel build() {
    return this.value;
  }

  public ShapeValueBuilder setValue(ShapeValueModel value) {
    this.value = value;
    return this;
  }
}
