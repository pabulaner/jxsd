package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_AxisUnitModel;

public class ST_AxisUnitBuilder {
  private Double value;

  public ST_AxisUnitBuilder() {
    this.value = null;
  }

  public ST_AxisUnitBuilder setValue(Double value) {
    this.value = value;
    return this;
  }

  public ST_AxisUnitBuilder from(ST_AxisUnitModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_AxisUnitModel build() {
    return new ST_AxisUnitModel(this.value);
  }
}
