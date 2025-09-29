package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaOutsetEffectModel;

/**
 * This is a generated sequence class.
 */
public class AlphaOutsetEffectBuilder {
  private long rad;

  public AlphaOutsetEffectBuilder() {
  }

  public AlphaOutsetEffectBuilder setRad(long rad) {
    this.rad = rad;
    return this;
  }

  public AlphaOutsetEffectBuilder from(AlphaOutsetEffectModel value) {
    this.rad = value.getRad();
    return this;
  }

  public AlphaOutsetEffectModel build() {
    return new AlphaOutsetEffectModel(this.rad);
  }
}
