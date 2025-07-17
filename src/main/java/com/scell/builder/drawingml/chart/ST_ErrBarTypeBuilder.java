package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_ErrBarTypeModel;

public class ST_ErrBarTypeBuilder {
  private ST_ErrBarTypeModel value;

  public ST_ErrBarTypeBuilder() {
    this.value = null;
  }

  public ST_ErrBarTypeBuilder from(ST_ErrBarTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_ErrBarTypeModel build() {
    return this.value;
  }

  public ST_ErrBarTypeBuilder setValue(ST_ErrBarTypeModel value) {
    this.value = value;
    return this;
  }
}
