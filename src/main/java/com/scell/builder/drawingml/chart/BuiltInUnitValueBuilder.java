package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BuiltInUnitValueModel;

public class BuiltInUnitValueBuilder {
  private BuiltInUnitValueModel value;

  public BuiltInUnitValueBuilder() {
    this.value = null;
  }

  public BuiltInUnitValueBuilder from(BuiltInUnitValueModel value) {
    this.value = value;
    return this;
  }

  public BuiltInUnitValueModel build() {
    return this.value;
  }

  public BuiltInUnitValueBuilder setValue(BuiltInUnitValueModel value) {
    this.value = value;
    return this;
  }
}
