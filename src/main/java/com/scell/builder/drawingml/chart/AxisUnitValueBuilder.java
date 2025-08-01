package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxisUnitValueModel;

public class AxisUnitValueBuilder {
  private double value;

  public AxisUnitValueBuilder() {
  }

  public AxisUnitValueBuilder setValue(double value) {
    this.value = value;
    return this;
  }

  public AxisUnitValueBuilder from(AxisUnitValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public AxisUnitValueModel build() {
    return new AxisUnitValueModel(this.value);
  }
}
