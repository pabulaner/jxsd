package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.CrossesValueBuilder;

/**
 * This is a generated enum class.
 */
public enum CrossesValueModel {
  AUTO_ZERO,

  MAX,

  MIN;

  public CrossesValueBuilder builder() {
    return new CrossesValueBuilder().from(this);
  }
}
