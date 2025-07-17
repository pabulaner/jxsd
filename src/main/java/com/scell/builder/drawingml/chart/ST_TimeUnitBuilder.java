package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_TimeUnitModel;

public class ST_TimeUnitBuilder {
  private ST_TimeUnitModel value;

  public ST_TimeUnitBuilder() {
    this.value = null;
  }

  public ST_TimeUnitBuilder from(ST_TimeUnitModel value) {
    this.value = value;
    return this;
  }

  public ST_TimeUnitModel build() {
    return this.value;
  }

  public ST_TimeUnitBuilder setValue(ST_TimeUnitModel value) {
    this.value = value;
    return this;
  }
}
