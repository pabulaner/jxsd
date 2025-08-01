package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ErrValTypeValueModel;

public class ErrValTypeValueBuilder {
  private ErrValTypeValueModel value;

  public ErrValTypeValueBuilder() {
    this.value = null;
  }

  public ErrValTypeValueBuilder from(ErrValTypeValueModel value) {
    this.value = value;
    return this;
  }

  public ErrValTypeValueModel build() {
    return this.value;
  }

  public ErrValTypeValueBuilder setValue(ErrValTypeValueModel value) {
    this.value = value;
    return this;
  }
}
