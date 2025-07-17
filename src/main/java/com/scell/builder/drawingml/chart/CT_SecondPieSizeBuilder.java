package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SecondPieSizeModel;
import com.scell.model.drawingml.chart.ST_SecondPieSizeModel;

public class CT_SecondPieSizeBuilder {
  private ST_SecondPieSizeModel val;

  public CT_SecondPieSizeBuilder() {
  }

  public CT_SecondPieSizeBuilder setVal(ST_SecondPieSizeModel val) {
    this.val = val;
    return this;
  }

  public CT_SecondPieSizeModel build() {
    return new CT_SecondPieSizeModel(this.val);
  }

  public CT_SecondPieSizeBuilder from(CT_SecondPieSizeModel value) {
    this.val = value.getVal();
    return this;
  }
}
