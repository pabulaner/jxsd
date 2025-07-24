package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TimeUnitModel;

public class TimeUnitBuilder {
  private TimeUnitModel val;

  public TimeUnitBuilder() {
  }

  public TimeUnitBuilder setVal(TimeUnitModel val) {
    this.val = val;
    return this;
  }

  public TimeUnitModel build() {
    return new TimeUnitModel(this.val);
  }

  public TimeUnitBuilder from(TimeUnitModel value) {
    this.val = value.getVal();
    return this;
  }
}
