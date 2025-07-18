package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ErrBarTypeModel;
import com.scell.model.drawingml.chart.ST_ErrBarTypeModel;

public class CT_ErrBarTypeBuilder {
  private ST_ErrBarTypeModel val;

  public CT_ErrBarTypeBuilder() {
  }

  public CT_ErrBarTypeBuilder setVal(ST_ErrBarTypeModel val) {
    this.val = val;
    return this;
  }

  public CT_ErrBarTypeModel build() {
    return new CT_ErrBarTypeModel(this.val);
  }

  public CT_ErrBarTypeBuilder from(CT_ErrBarTypeModel value) {
    this.val = value.getVal();
    return this;
  }
}
