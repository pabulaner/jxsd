package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ErrValTypeModel;
import com.scell.model.drawingml.chart.ErrValTypeValueModel;

public class ErrValTypeBuilder {
  private ErrValTypeValueModel val;

  public ErrValTypeBuilder() {
  }

  public ErrValTypeBuilder setVal(ErrValTypeValueModel val) {
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
