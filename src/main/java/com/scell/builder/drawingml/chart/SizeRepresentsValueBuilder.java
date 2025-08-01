package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SizeRepresentsValueModel;

public class SizeRepresentsValueBuilder {
  private SizeRepresentsValueModel value;

  public SizeRepresentsValueBuilder() {
    this.value = null;
  }

  public SizeRepresentsValueBuilder from(SizeRepresentsValueModel value) {
    this.value = value;
    return this;
  }

  public SizeRepresentsValueModel build() {
    return this.value;
  }

  public SizeRepresentsValueBuilder setValue(SizeRepresentsValueModel value) {
    this.value = value;
    return this;
  }
}
