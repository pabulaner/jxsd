package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CrossesValueModel;

public class CrossesValueBuilder {
  private CrossesValueModel value;

  public CrossesValueBuilder() {
    this.value = null;
  }

  public CrossesValueBuilder from(CrossesValueModel value) {
    this.value = value;
    return this;
  }

  public CrossesValueModel build() {
    return this.value;
  }

  public CrossesValueBuilder setValue(CrossesValueModel value) {
    this.value = value;
    return this;
  }
}
