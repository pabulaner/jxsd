package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.GapAmountBuilder;

/**
 * This is a generated sequence class.
 */
public class GapAmountModel {
  private final int val;

  public GapAmountModel(int val) {
    this.val = val;
  }

  public GapAmountBuilder builder() {
    return new GapAmountBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
