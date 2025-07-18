package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_OfPieTypeModel;
import com.scell.model.drawingml.chart.ST_OfPieTypeModel;

public class CT_OfPieTypeBuilder {
  private ST_OfPieTypeModel val;

  public CT_OfPieTypeBuilder() {
  }

  public CT_OfPieTypeBuilder setVal(ST_OfPieTypeModel val) {
    this.val = val;
    return this;
  }

  public CT_OfPieTypeModel build() {
    return new CT_OfPieTypeModel(this.val);
  }

  public CT_OfPieTypeBuilder from(CT_OfPieTypeModel value) {
    this.val = value.getVal();
    return this;
  }
}
