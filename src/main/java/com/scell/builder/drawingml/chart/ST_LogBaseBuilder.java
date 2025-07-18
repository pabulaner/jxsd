package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LogBaseModel;

public class ST_LogBaseBuilder {
  private Double value;

  public ST_LogBaseBuilder() {
    this.value = null;
  }

  public ST_LogBaseBuilder setValue(Double value) {
    this.value = value;
    return this;
  }

  public ST_LogBaseBuilder from(ST_LogBaseModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_LogBaseModel build() {
    return new ST_LogBaseModel(this.value);
  }
}
