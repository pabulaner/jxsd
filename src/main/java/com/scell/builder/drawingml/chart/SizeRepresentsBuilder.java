package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SizeRepresentsModel;
import com.scell.model.drawingml.chart.SizeRepresentsValueModel;

public class SizeRepresentsBuilder {
  private SizeRepresentsValueModel val;

  public SizeRepresentsBuilder() {
  }

  public SizeRepresentsBuilder setVal(SizeRepresentsValueModel val) {
    this.val = val;
    return this;
  }

  public SizeRepresentsModel build() {
    return new SizeRepresentsModel(this.val);
  }

  public SizeRepresentsBuilder from(SizeRepresentsModel value) {
    this.val = value.getVal();
    return this;
  }
}
