package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PerspectiveModel;

public class PerspectiveBuilder {
  private PerspectiveModel val;

  public PerspectiveBuilder() {
  }

  public PerspectiveBuilder setVal(PerspectiveModel val) {
    this.val = val;
    return this;
  }

  public PerspectiveModel build() {
    return new PerspectiveModel(this.val);
  }

  public PerspectiveBuilder from(PerspectiveModel value) {
    this.val = value.getVal();
    return this;
  }
}
