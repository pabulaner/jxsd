package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TimeUnitModel;
import com.scell.model.drawingml.chart.TimeUnitValueModel;

public class TimeUnitBuilder {
  private TimeUnitValueModel val;

  public TimeUnitBuilder() {
  }

  public TimeUnitBuilder setVal(TimeUnitValueModel val) {
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
