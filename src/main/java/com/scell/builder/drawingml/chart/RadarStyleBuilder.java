package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.RadarStyleModel;
import com.scell.model.drawingml.chart.RadarStyleValueModel;

public class RadarStyleBuilder {
  private RadarStyleValueModel val;

  public RadarStyleBuilder() {
  }

  public RadarStyleBuilder setVal(RadarStyleValueModel val) {
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
