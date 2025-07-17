package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ErrValTypeModel;
import com.scell.model.drawingml.chart.ST_ErrValTypeModel;

public class CT_ErrValTypeBuilder {
  private ST_ErrValTypeModel val;

  public CT_ErrValTypeBuilder() {
  }

  public CT_ErrValTypeBuilder setVal(ST_ErrValTypeModel val) {
    this.val = val;
    return this;
  }

  public CT_ErrValTypeModel build() {
    return new CT_ErrValTypeModel(this.val);
  }

  public CT_ErrValTypeBuilder from(CT_ErrValTypeModel value) {
    this.val = value.getVal();
    return this;
  }
}
