package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ErrBarTypeModel;
import com.scell.model.drawingml.chart.ErrBarTypeValueModel;

public class ErrBarTypeBuilder {
  private ErrBarTypeValueModel val;

  public ErrBarTypeBuilder() {
  }

  public ErrBarTypeBuilder setVal(ErrBarTypeValueModel val) {
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
