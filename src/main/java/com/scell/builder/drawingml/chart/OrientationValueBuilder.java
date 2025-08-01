package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OrientationValueModel;

public class OrientationValueBuilder {
  private OrientationValueModel value;

  public OrientationValueBuilder() {
    this.value = null;
  }

  public OrientationValueBuilder from(OrientationValueModel value) {
    this.value = value;
    return this;
  }

  public OrientationValueModel build() {
    return this.value;
  }

  public OrientationValueBuilder setValue(OrientationValueModel value) {
    this.value = value;
    return this;
  }
}
