package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_RotXModel;

public class ST_RotXBuilder {
  private Long value;

  public ST_RotXBuilder() {
    this.value = null;
  }

  public ST_RotXBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_RotXBuilder from(ST_RotXModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_RotXModel build() {
    return new ST_RotXModel(this.value);
  }
}
