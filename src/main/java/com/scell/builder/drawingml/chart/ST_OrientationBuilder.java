package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_OrientationModel;

public class ST_OrientationBuilder {
  private ST_OrientationModel value;

  public ST_OrientationBuilder() {
    this.value = null;
  }

  public ST_OrientationBuilder from(ST_OrientationModel value) {
    this.value = value;
    return this;
  }

  public ST_OrientationModel build() {
    return this.value;
  }

  public ST_OrientationBuilder setValue(ST_OrientationModel value) {
    this.value = value;
    return this;
  }
}
