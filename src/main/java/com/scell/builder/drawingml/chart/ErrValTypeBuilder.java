package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ErrValTypeModel;

public class ErrValTypeBuilder {
  private ErrValTypeModel val;

  public ErrValTypeBuilder() {
  }

  public ErrValTypeBuilder setVal(ErrValTypeModel val) {
    this.val = val;
    return this;
  }

  public ErrValTypeModel build() {
    return new ErrValTypeModel(this.val);
  }

  public ErrValTypeBuilder from(ErrValTypeModel value) {
    this.val = value.getVal();
    return this;
  }
}
