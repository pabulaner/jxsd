package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TimeUnitBuilder;

/**
 * This is a generated sequence class.
 */
public class TimeUnitModel {
  private final TimeUnitValueModel val;

  public TimeUnitModel(TimeUnitValueModel val) {
    this.val = val;
  }

  public TimeUnitBuilder builder() {
    return new TimeUnitBuilder().from(this);
  }

  public TimeUnitValueModel getVal() {
    return this.val;
  }
}
