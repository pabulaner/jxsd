package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BlurEffectModel;

/**
 * This is a generated sequence class.
 */
public class BlurEffectBuilder {
  private long rad;

  private boolean grow;

  public BlurEffectBuilder() {
  }

  public BlurEffectBuilder setRad(long rad) {
    this.rad = rad;
    return this;
  }

  public BlurEffectBuilder setGrow(boolean grow) {
    this.grow = grow;
    return this;
  }

  public BlurEffectBuilder from(BlurEffectModel value) {
    this.rad = value.getRad();
    this.grow = value.getGrow();
    return this;
  }

  public BlurEffectModel build() {
    return new BlurEffectModel(this.rad, this.grow);
  }
}
