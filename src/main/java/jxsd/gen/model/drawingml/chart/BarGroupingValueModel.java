package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.BarGroupingValueBuilder;

/**
 * This is a generated enum class.
 */
public enum BarGroupingValueModel {
  PERCENT_STACKED,

  CLUSTERED,

  STANDARD,

  STACKED;

  public BarGroupingValueBuilder builder() {
    return new BarGroupingValueBuilder().from(this);
  }
}
