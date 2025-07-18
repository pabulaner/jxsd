package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_OrientationModel;
import com.scell.model.drawingml.chart.ST_OrientationModel;

public class CT_OrientationBuilder {
  private ST_OrientationModel val;

  public CT_OrientationBuilder() {
  }

  public CT_OrientationBuilder setVal(ST_OrientationModel val) {
    this.val = val;
    return this;
  }

  public CT_OrientationModel build() {
    return new CT_OrientationModel(this.val);
  }

  public CT_OrientationBuilder from(CT_OrientationModel value) {
    this.val = value.getVal();
    return this;
  }
}
