package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_BuiltInUnitModel;

public class ST_BuiltInUnitBuilder {
  private ST_BuiltInUnitModel value;

  public ST_BuiltInUnitBuilder() {
    this.value = null;
  }

  public ST_BuiltInUnitBuilder from(ST_BuiltInUnitModel value) {
    this.value = value;
    return this;
  }

  public ST_BuiltInUnitModel build() {
    return this.value;
  }

  public ST_BuiltInUnitBuilder setValue(ST_BuiltInUnitModel value) {
    this.value = value;
    return this;
  }
}
