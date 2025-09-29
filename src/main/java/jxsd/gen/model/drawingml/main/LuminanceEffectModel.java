package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.LuminanceEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class LuminanceEffectModel {
  private final int contrast;

  private final int bright;

  public LuminanceEffectModel(int contrast, int bright) {
    this.contrast = contrast;
    this.bright = bright;
  }

  public LuminanceEffectBuilder builder() {
    return new LuminanceEffectBuilder().from(this);
  }

  public int getContrast() {
    return this.contrast;
  }

  public int getBright() {
    return this.bright;
  }
}
