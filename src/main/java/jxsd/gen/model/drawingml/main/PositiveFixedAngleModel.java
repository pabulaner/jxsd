package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PositiveFixedAngleBuilder;

/**
 * This is a generated sequence class.
 */
public class PositiveFixedAngleModel {
  private final int val;

  public PositiveFixedAngleModel(int val) {
    this.val = val;
  }

  public PositiveFixedAngleBuilder builder() {
    return new PositiveFixedAngleBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
