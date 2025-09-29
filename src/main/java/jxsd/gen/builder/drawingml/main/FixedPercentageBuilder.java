package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.FixedPercentageModel;

/**
 * This is a generated sequence class.
 */
public class FixedPercentageBuilder {
  private int val;

  public FixedPercentageBuilder() {
  }

  public FixedPercentageBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public FixedPercentageBuilder from(FixedPercentageModel value) {
    this.val = value.getVal();
    return this;
  }

  public FixedPercentageModel build() {
    return new FixedPercentageModel(this.val);
  }
}
