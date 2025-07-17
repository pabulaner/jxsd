package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_RadarStyleModel;

public class ST_RadarStyleBuilder {
  private ST_RadarStyleModel value;

  public ST_RadarStyleBuilder() {
    this.value = null;
  }

  public ST_RadarStyleBuilder from(ST_RadarStyleModel value) {
    this.value = value;
    return this;
  }

  public ST_RadarStyleModel build() {
    return this.value;
  }

  public ST_RadarStyleBuilder setValue(ST_RadarStyleModel value) {
    this.value = value;
    return this;
  }
}
