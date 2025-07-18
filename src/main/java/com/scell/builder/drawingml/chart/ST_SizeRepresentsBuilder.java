package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_SizeRepresentsModel;

public class ST_SizeRepresentsBuilder {
  private ST_SizeRepresentsModel value;

  public ST_SizeRepresentsBuilder() {
    this.value = null;
  }

  public ST_SizeRepresentsBuilder from(ST_SizeRepresentsModel value) {
    this.value = value;
    return this;
  }

  public ST_SizeRepresentsModel build() {
    return this.value;
  }

  public ST_SizeRepresentsBuilder setValue(ST_SizeRepresentsModel value) {
    this.value = value;
    return this;
  }
}
