package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PositivePercentageBuilder;

/**
 * This is a generated sequence class.
 */
public class PositivePercentageModel {
  private final int val;

  public PositivePercentageModel(int val) {
    this.val = val;
  }

  public PositivePercentageBuilder builder() {
    return new PositivePercentageBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
