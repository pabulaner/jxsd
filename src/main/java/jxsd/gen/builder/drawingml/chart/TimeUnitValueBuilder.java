package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TimeUnitValueModel;

/**
 * This is a generated enum class.
 */
public class TimeUnitValueBuilder {
  private TimeUnitValueModel value;

  public TimeUnitValueBuilder() {
  }

  public TimeUnitValueBuilder setValue(TimeUnitValueModel value) {
    this.value = value;
    return this;
  }

  public TimeUnitValueBuilder from(TimeUnitValueModel value) {
    this.value = value;
    return this;
  }

  public TimeUnitValueModel build() {
    return this.value;
  }
}
