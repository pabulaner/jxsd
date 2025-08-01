package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OrientationModel;
import com.scell.model.drawingml.chart.OrientationValueModel;

public class OrientationBuilder {
  private OrientationValueModel val;

  public OrientationBuilder() {
  }

  public OrientationBuilder setVal(OrientationValueModel val) {
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
