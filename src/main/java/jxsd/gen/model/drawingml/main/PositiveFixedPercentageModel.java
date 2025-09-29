package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PositiveFixedPercentageBuilder;

/**
 * This is a generated sequence class.
 */
public class PositiveFixedPercentageModel {
  private final int val;

  public PositiveFixedPercentageModel(int val) {
    this.val = val;
  }

  public PositiveFixedPercentageBuilder builder() {
    return new PositiveFixedPercentageBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
