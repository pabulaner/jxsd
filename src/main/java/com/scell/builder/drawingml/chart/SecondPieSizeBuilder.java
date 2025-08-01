package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SecondPieSizeModel;
import com.scell.model.drawingml.chart.SecondPieSizeValueModel;

public class SecondPieSizeBuilder {
  private SecondPieSizeValueModel val;

  public SecondPieSizeBuilder() {
  }

  public SecondPieSizeBuilder setVal(SecondPieSizeValueModel val) {
    this.val = val;
    return this;
  }

  public SecondPieSizeModel build() {
    return new SecondPieSizeModel(this.val);
  }

  public SecondPieSizeBuilder from(SecondPieSizeModel value) {
    this.val = value.getVal();
    return this;
  }
}
