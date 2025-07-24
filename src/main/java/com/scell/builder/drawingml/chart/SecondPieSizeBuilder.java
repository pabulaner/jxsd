package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SecondPieSizeModel;

public class SecondPieSizeBuilder {
  private SecondPieSizeModel val;

  public SecondPieSizeBuilder() {
  }

  public SecondPieSizeBuilder setVal(SecondPieSizeModel val) {
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
