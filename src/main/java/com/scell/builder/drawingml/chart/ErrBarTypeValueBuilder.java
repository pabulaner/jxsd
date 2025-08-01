package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ErrBarTypeValueModel;

public class ErrBarTypeValueBuilder {
  private ErrBarTypeValueModel value;

  public ErrBarTypeValueBuilder() {
    this.value = null;
  }

  public ErrBarTypeValueBuilder from(ErrBarTypeValueModel value) {
    this.value = value;
    return this;
  }

  public ErrBarTypeValueModel build() {
    return this.value;
  }

  public ErrBarTypeValueBuilder setValue(ErrBarTypeValueModel value) {
    this.value = value;
    return this;
  }
}
