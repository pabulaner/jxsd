package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.HPercentBuilder;

/**
 * This is a generated sequence class.
 */
public class HPercentModel {
  private final int val;

  public HPercentModel(int val) {
    this.val = val;
  }

  public HPercentBuilder builder() {
    return new HPercentBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
