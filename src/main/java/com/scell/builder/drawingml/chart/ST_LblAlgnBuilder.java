package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LblAlgnModel;

public class ST_LblAlgnBuilder {
  private ST_LblAlgnModel value;

  public ST_LblAlgnBuilder() {
    this.value = null;
  }

  public ST_LblAlgnBuilder from(ST_LblAlgnModel value) {
    this.value = value;
    return this;
  }

  public ST_LblAlgnModel build() {
    return this.value;
  }

  public ST_LblAlgnBuilder setValue(ST_LblAlgnModel value) {
    this.value = value;
    return this;
  }
}
