package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.CrossBetweenValueBuilder;

/**
 * This is a generated enum class.
 */
public enum CrossBetweenValueModel {
  BETWEEN,

  MID_CAT;

  public CrossBetweenValueBuilder builder() {
    return new CrossBetweenValueBuilder().from(this);
  }
}
