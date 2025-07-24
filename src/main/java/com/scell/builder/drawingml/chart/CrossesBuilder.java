package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CrossesModel;

public class CrossesBuilder {
  private CrossesModel val;

  public CrossesBuilder() {
  }

  public CrossesBuilder setVal(CrossesModel val) {
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
