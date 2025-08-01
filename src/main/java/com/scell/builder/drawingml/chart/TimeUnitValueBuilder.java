package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TimeUnitValueModel;

public class TimeUnitValueBuilder {
  private TimeUnitValueModel value;

  public TimeUnitValueBuilder() {
    this.value = null;
  }

  public TimeUnitValueBuilder from(TimeUnitValueModel value) {
    this.value = value;
    return this;
  }

  public TimeUnitValueModel build() {
    return this.value;
  }

  public TimeUnitValueBuilder setValue(TimeUnitValueModel value) {
    this.value = value;
    return this;
  }
}
