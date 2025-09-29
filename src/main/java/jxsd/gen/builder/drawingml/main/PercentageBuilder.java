package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PercentageModel;

/**
 * This is a generated sequence class.
 */
public class PercentageBuilder {
  private int val;

  public PercentageBuilder() {
  }

  public PercentageBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public PercentageBuilder from(PercentageModel value) {
    this.val = value.getVal();
    return this;
  }

  public PercentageModel build() {
    return new PercentageModel(this.val);
  }
}
