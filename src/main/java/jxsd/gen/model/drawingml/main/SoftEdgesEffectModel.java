package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.SoftEdgesEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class SoftEdgesEffectModel {
  private final long rad;

  public SoftEdgesEffectModel(long rad) {
    this.rad = rad;
  }

  public SoftEdgesEffectBuilder builder() {
    return new SoftEdgesEffectBuilder().from(this);
  }

  public long getRad() {
    return this.rad;
  }
}
