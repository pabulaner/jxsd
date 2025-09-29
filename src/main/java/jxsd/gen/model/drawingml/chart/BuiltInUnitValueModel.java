package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.BuiltInUnitValueBuilder;

/**
 * This is a generated enum class.
 */
public enum BuiltInUnitValueModel {
  HUNDREDS,

  THOUSANDS,

  TEN_THOUSANDS,

  HUNDRED_THOUSANDS,

  MILLIONS,

  TEN_MILLIONS,

  HUNDRED_MILLIONS,

  BILLIONS,

  TRILLIONS;

  public BuiltInUnitValueBuilder builder() {
    return new BuiltInUnitValueBuilder().from(this);
  }
}
