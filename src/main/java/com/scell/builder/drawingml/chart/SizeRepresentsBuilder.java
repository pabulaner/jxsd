package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SizeRepresentsModel;

public class SizeRepresentsBuilder {
  private SizeRepresentsModel val;

  public SizeRepresentsBuilder() {
  }

  public SizeRepresentsBuilder setVal(SizeRepresentsModel val) {
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
