package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.AngleBuilder;

/**
 * This is a generated sequence class.
 */
public class AngleModel {
  private final int val;

  public AngleModel(int val) {
    this.val = val;
  }

  public AngleBuilder builder() {
    return new AngleBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
