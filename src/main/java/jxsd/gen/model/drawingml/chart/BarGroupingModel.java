package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.BarGroupingBuilder;

/**
 * This is a generated sequence class.
 */
public class BarGroupingModel {
  private final BarGroupingValueModel val;

  public BarGroupingModel(BarGroupingValueModel val) {
    this.val = val;
  }

  public BarGroupingBuilder builder() {
    return new BarGroupingBuilder().from(this);
  }

  public BarGroupingValueModel getVal() {
    return this.val;
  }
}
