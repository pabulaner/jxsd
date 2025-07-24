package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ErrBarTypeModel;

public class ErrBarTypeBuilder {
  private ErrBarTypeModel val;

  public ErrBarTypeBuilder() {
  }

  public ErrBarTypeBuilder setVal(ErrBarTypeModel val) {
    this.val = val;
    return this;
  }

  public ErrBarTypeModel build() {
    return new ErrBarTypeModel(this.val);
  }

  public ErrBarTypeBuilder from(ErrBarTypeModel value) {
    this.val = value.getVal();
    return this;
  }
}
