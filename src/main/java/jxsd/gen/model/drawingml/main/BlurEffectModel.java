package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.BlurEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class BlurEffectModel {
  private final long rad;

  private final boolean grow;

  public BlurEffectModel(long rad, boolean grow) {
    this.rad = rad;
    this.grow = grow;
  }

  public BlurEffectBuilder builder() {
    return new BlurEffectBuilder().from(this);
  }

  public long getRad() {
    return this.rad;
  }

  public boolean getGrow() {
    return this.grow;
  }
}
