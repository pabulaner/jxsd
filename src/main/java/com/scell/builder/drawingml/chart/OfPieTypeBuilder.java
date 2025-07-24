package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OfPieTypeModel;

public class OfPieTypeBuilder {
  private OfPieTypeModel val;

  public OfPieTypeBuilder() {
  }

  public OfPieTypeBuilder setVal(OfPieTypeModel val) {
    this.val = val;
    return this;
  }

  public OfPieTypeModel build() {
    return new OfPieTypeModel(this.val);
  }

  public OfPieTypeBuilder from(OfPieTypeModel value) {
    this.val = value.getVal();
    return this;
  }
}
