package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TrendlineTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum TrendlineTypeValueModel {
  EXP,

  LINEAR,

  LOG,

  MOVING_AVG,

  POLY,

  POWER;

  public TrendlineTypeValueBuilder builder() {
    return new TrendlineTypeValueBuilder().from(this);
  }
}
