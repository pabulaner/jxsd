package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.LblAlgnBuilder;

/**
 * This is a generated sequence class.
 */
public class LblAlgnModel {
  private final LblAlgnValueModel val;

  public LblAlgnModel(LblAlgnValueModel val) {
    this.val = val;
  }

  public LblAlgnBuilder builder() {
    return new LblAlgnBuilder().from(this);
  }

  public LblAlgnValueModel getVal() {
    return this.val;
  }
}
