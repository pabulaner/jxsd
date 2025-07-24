package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.RadarStyleModel;

public class RadarStyleBuilder {
  private RadarStyleModel val;

  public RadarStyleBuilder() {
  }

  public RadarStyleBuilder setVal(RadarStyleModel val) {
    this.val = val;
    return this;
  }

  public RadarStyleModel build() {
    return new RadarStyleModel(this.val);
  }

  public RadarStyleBuilder from(RadarStyleModel value) {
    this.val = value.getVal();
    return this;
  }
}
