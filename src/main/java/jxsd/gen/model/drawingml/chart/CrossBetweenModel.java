package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.CrossBetweenBuilder;

/**
 * This is a generated sequence class.
 */
public class CrossBetweenModel {
  private final CrossBetweenValueModel val;

  public CrossBetweenModel(CrossBetweenValueModel val) {
    this.val = val;
  }

  public CrossBetweenBuilder builder() {
    return new CrossBetweenBuilder().from(this);
  }

  public CrossBetweenValueModel getVal() {
    return this.val;
  }
}
