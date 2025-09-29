package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.HSLEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class HSLEffectModel {
  private final int hue;

  private final int lum;

  private final int sat;

  public HSLEffectModel(int hue, int lum, int sat) {
    this.hue = hue;
    this.lum = lum;
    this.sat = sat;
  }

  public HSLEffectBuilder builder() {
    return new HSLEffectBuilder().from(this);
  }

  public int getHue() {
    return this.hue;
  }

  public int getLum() {
    return this.lum;
  }

  public int getSat() {
    return this.sat;
  }
}
