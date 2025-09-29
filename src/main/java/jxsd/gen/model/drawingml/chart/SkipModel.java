package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.SkipBuilder;

/**
 * This is a generated sequence class.
 */
public class SkipModel {
  private final int val;

  public SkipModel(int val) {
    this.val = val;
  }

  public SkipBuilder builder() {
    return new SkipBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
