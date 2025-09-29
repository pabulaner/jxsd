package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.FixedPercentageBuilder;

/**
 * This is a generated sequence class.
 */
public class FixedPercentageModel {
  private final int val;

  public FixedPercentageModel(int val) {
    this.val = val;
  }

  public FixedPercentageBuilder builder() {
    return new FixedPercentageBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
