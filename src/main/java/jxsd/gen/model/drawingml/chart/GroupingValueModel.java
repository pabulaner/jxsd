package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.GroupingValueBuilder;

/**
 * This is a generated enum class.
 */
public enum GroupingValueModel {
  PERCENT_STACKED,

  STANDARD,

  STACKED;

  public GroupingValueBuilder builder() {
    return new GroupingValueBuilder().from(this);
  }
}
