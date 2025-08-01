package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.RadarStyleValueModel;

public class RadarStyleValueBuilder {
  private RadarStyleValueModel value;

  public RadarStyleValueBuilder() {
    this.value = null;
  }

  public RadarStyleValueBuilder from(RadarStyleValueModel value) {
    this.value = value;
    return this;
  }

  public RadarStyleValueModel build() {
    return this.value;
  }

  public RadarStyleValueBuilder setValue(RadarStyleValueModel value) {
    this.value = value;
    return this;
  }
}
