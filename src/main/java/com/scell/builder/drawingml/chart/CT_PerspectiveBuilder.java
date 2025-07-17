package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PerspectiveModel;
import com.scell.model.drawingml.chart.ST_PerspectiveModel;

public class CT_PerspectiveBuilder {
  private ST_PerspectiveModel val;

  public CT_PerspectiveBuilder() {
  }

  public CT_PerspectiveBuilder setVal(ST_PerspectiveModel val) {
    this.val = val;
    return this;
  }

  public CT_PerspectiveModel build() {
    return new CT_PerspectiveModel(this.val);
  }

  public CT_PerspectiveBuilder from(CT_PerspectiveModel value) {
    this.val = value.getVal();
    return this;
  }
}
