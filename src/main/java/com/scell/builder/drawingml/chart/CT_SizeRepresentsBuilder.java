package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SizeRepresentsModel;
import com.scell.model.drawingml.chart.ST_SizeRepresentsModel;

public class CT_SizeRepresentsBuilder {
  private ST_SizeRepresentsModel val;

  public CT_SizeRepresentsBuilder() {
  }

  public CT_SizeRepresentsBuilder setVal(ST_SizeRepresentsModel val) {
    this.val = val;
    return this;
  }

  public CT_SizeRepresentsModel build() {
    return new CT_SizeRepresentsModel(this.val);
  }

  public CT_SizeRepresentsBuilder from(CT_SizeRepresentsModel value) {
    this.val = value.getVal();
    return this;
  }
}
