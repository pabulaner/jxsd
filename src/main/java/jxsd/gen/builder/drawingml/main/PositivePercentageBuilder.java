package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PositivePercentageModel;

/**
 * This is a generated sequence class.
 */
public class PositivePercentageBuilder {
  private int val;

  public PositivePercentageBuilder() {
  }

  public PositivePercentageBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public PositivePercentageBuilder from(PositivePercentageModel value) {
    this.val = value.getVal();
    return this;
  }

  public PositivePercentageModel build() {
    return new PositivePercentageModel(this.val);
  }
}
