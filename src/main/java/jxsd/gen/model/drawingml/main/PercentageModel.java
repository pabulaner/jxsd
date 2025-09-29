package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PercentageBuilder;

/**
 * This is a generated sequence class.
 */
public class PercentageModel {
  private final int val;

  public PercentageModel(int val) {
    this.val = val;
  }

  public PercentageBuilder builder() {
    return new PercentageBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
