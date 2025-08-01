package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PerspectiveModel;
import com.scell.model.drawingml.chart.PerspectiveValueModel;

public class PerspectiveBuilder {
  private PerspectiveValueModel val;

  public PerspectiveBuilder() {
  }

  public PerspectiveBuilder setVal(PerspectiveValueModel val) {
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
