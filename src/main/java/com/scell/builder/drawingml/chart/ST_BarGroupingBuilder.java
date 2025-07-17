package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_BarGroupingModel;

public class ST_BarGroupingBuilder {
  private ST_BarGroupingModel value;

  public ST_BarGroupingBuilder() {
    this.value = null;
  }

  public ST_BarGroupingBuilder from(ST_BarGroupingModel value) {
    this.value = value;
    return this;
  }

  public ST_BarGroupingModel build() {
    return this.value;
  }

  public ST_BarGroupingBuilder setValue(ST_BarGroupingModel value) {
    this.value = value;
    return this;
  }
}
