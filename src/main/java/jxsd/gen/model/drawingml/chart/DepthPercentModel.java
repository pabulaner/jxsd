package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.DepthPercentBuilder;

/**
 * This is a generated sequence class.
 */
public class DepthPercentModel {
  private final int val;

  public DepthPercentModel(int val) {
    this.val = val;
  }

  public DepthPercentBuilder builder() {
    return new DepthPercentBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
