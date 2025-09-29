package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.SoftEdgesEffectModel;

/**
 * This is a generated sequence class.
 */
public class SoftEdgesEffectBuilder {
  private long rad;

  public SoftEdgesEffectBuilder() {
  }

  public SoftEdgesEffectBuilder setRad(long rad) {
    this.rad = rad;
    return this;
  }

  public SoftEdgesEffectBuilder from(SoftEdgesEffectModel value) {
    this.rad = value.getRad();
    return this;
  }

  public SoftEdgesEffectModel build() {
    return new SoftEdgesEffectModel(this.rad);
  }
}
