package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OfPieTypeModel;
import com.scell.model.drawingml.chart.OfPieTypeValueModel;

public class OfPieTypeBuilder {
  private OfPieTypeValueModel val;

  public OfPieTypeBuilder() {
  }

  public OfPieTypeBuilder setVal(OfPieTypeValueModel val) {
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
