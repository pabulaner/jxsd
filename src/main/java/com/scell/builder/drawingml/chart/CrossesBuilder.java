package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CrossesModel;
import com.scell.model.drawingml.chart.CrossesValueModel;

public class CrossesBuilder {
  private CrossesValueModel val;

  public CrossesBuilder() {
  }

  public CrossesBuilder setVal(CrossesValueModel val) {
    this.val = val;
    return this;
  }

  public CrossesModel build() {
    return new CrossesModel(this.val);
  }

  public CrossesBuilder from(CrossesModel value) {
    this.val = value.getVal();
    return this;
  }
}
