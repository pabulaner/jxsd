package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TimeUnitValueBuilder;

/**
 * This is a generated enum class.
 */
public enum TimeUnitValueModel {
  DAYS,

  MONTHS,

  YEARS;

  public TimeUnitValueBuilder builder() {
    return new TimeUnitValueBuilder().from(this);
  }
}
