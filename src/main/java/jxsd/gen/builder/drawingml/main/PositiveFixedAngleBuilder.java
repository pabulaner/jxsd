package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PositiveFixedAngleModel;

/**
 * This is a generated sequence class.
 */
public class PositiveFixedAngleBuilder {
  private int val;

  public PositiveFixedAngleBuilder() {
  }

  public PositiveFixedAngleBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public PositiveFixedAngleBuilder from(PositiveFixedAngleModel value) {
    this.val = value.getVal();
    return this;
  }

  public PositiveFixedAngleModel build() {
    return new PositiveFixedAngleModel(this.val);
  }
}
