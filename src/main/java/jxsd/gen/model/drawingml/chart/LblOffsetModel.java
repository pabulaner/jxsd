package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.LblOffsetBuilder;

/**
 * This is a generated sequence class.
 */
public class LblOffsetModel {
  private final int val;

  public LblOffsetModel(int val) {
    this.val = val;
  }

  public LblOffsetBuilder builder() {
    return new LblOffsetBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
