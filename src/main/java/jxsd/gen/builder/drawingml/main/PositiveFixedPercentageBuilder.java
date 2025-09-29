package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PositiveFixedPercentageModel;

/**
 * This is a generated sequence class.
 */
public class PositiveFixedPercentageBuilder {
  private int val;

  public PositiveFixedPercentageBuilder() {
  }

  public PositiveFixedPercentageBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public PositiveFixedPercentageBuilder from(PositiveFixedPercentageModel value) {
    this.val = value.getVal();
    return this;
  }

  public PositiveFixedPercentageModel build() {
    return new PositiveFixedPercentageModel(this.val);
  }
}
