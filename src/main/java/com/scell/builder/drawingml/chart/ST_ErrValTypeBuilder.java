package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_ErrValTypeModel;

public class ST_ErrValTypeBuilder {
  private ST_ErrValTypeModel value;

  public ST_ErrValTypeBuilder() {
    this.value = null;
  }

  public ST_ErrValTypeBuilder from(ST_ErrValTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_ErrValTypeModel build() {
    return this.value;
  }

  public ST_ErrValTypeBuilder setValue(ST_ErrValTypeModel value) {
    this.value = value;
    return this;
  }
}
