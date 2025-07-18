package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_MarkerSizeModel;
import com.scell.model.drawingml.chart.ST_MarkerSizeModel;

public class CT_MarkerSizeBuilder {
  private ST_MarkerSizeModel val;

  public CT_MarkerSizeBuilder() {
  }

  public CT_MarkerSizeBuilder setVal(ST_MarkerSizeModel val) {
    this.val = val;
    return this;
  }

  public CT_MarkerSizeModel build() {
    return new CT_MarkerSizeModel(this.val);
  }

  public CT_MarkerSizeBuilder from(CT_MarkerSizeModel value) {
    this.val = value.getVal();
    return this;
  }
}
