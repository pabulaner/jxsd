package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OrientationModel;

public class OrientationBuilder {
  private OrientationModel val;

  public OrientationBuilder() {
  }

  public OrientationBuilder setVal(OrientationModel val) {
    this.val = val;
    return this;
  }

  public OrientationModel build() {
    return new OrientationModel(this.val);
  }

  public OrientationBuilder from(OrientationModel value) {
    this.val = value.getVal();
    return this;
  }
}
