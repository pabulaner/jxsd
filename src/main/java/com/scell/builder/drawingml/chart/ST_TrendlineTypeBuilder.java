package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_TrendlineTypeModel;

public class ST_TrendlineTypeBuilder {
  private ST_TrendlineTypeModel value;

  public ST_TrendlineTypeBuilder() {
    this.value = null;
  }

  public ST_TrendlineTypeBuilder from(ST_TrendlineTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TrendlineTypeModel build() {
    return this.value;
  }

  public ST_TrendlineTypeBuilder setValue(ST_TrendlineTypeModel value) {
    this.value = value;
    return this;
  }
}
