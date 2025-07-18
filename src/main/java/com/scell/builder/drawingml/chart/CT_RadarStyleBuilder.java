package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_RadarStyleModel;
import com.scell.model.drawingml.chart.ST_RadarStyleModel;

public class CT_RadarStyleBuilder {
  private ST_RadarStyleModel val;

  public CT_RadarStyleBuilder() {
  }

  public CT_RadarStyleBuilder setVal(ST_RadarStyleModel val) {
    this.val = val;
    return this;
  }

  public CT_RadarStyleModel build() {
    return new CT_RadarStyleModel(this.val);
  }

  public CT_RadarStyleBuilder from(CT_RadarStyleModel value) {
    this.val = value.getVal();
    return this;
  }
}
