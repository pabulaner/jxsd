package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TimeUnitModel;
import jxsd.gen.model.drawingml.chart.TimeUnitValueModel;

/**
 * This is a generated sequence class.
 */
public class TimeUnitBuilder {
  private TimeUnitValueModel val;

  public TimeUnitBuilder() {
  }

  public TimeUnitBuilder setVal(TimeUnitValueModel val) {
    this.val = val;
    return this;
  }

  public TimeUnitBuilder from(TimeUnitModel value) {
    this.val = value.getVal();
    return this;
  }

  public TimeUnitModel build() {
    return new TimeUnitModel(this.val);
  }
}
