package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.AlphaOutsetEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class AlphaOutsetEffectModel {
  private final long rad;

  public AlphaOutsetEffectModel(long rad) {
    this.rad = rad;
  }

  public AlphaOutsetEffectBuilder builder() {
    return new AlphaOutsetEffectBuilder().from(this);
  }

  public long getRad() {
    return this.rad;
  }
}
