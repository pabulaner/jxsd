package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PerspectiveValueModel;

public class PerspectiveValueBuilder {
  private short value;

  public PerspectiveValueBuilder() {
  }

  public PerspectiveValueBuilder setValue(short value) {
    this.value = value;
    return this;
  }

  public PerspectiveValueBuilder from(PerspectiveValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public PerspectiveValueModel build() {
    return new PerspectiveValueModel(this.value);
  }
}
