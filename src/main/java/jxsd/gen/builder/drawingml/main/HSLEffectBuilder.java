package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.HSLEffectModel;

/**
 * This is a generated sequence class.
 */
public class HSLEffectBuilder {
  private int hue;

  private int lum;

  private int sat;

  public HSLEffectBuilder() {
  }

  public HSLEffectBuilder setHue(int hue) {
    this.hue = hue;
    return this;
  }

  public HSLEffectBuilder setLum(int lum) {
    this.lum = lum;
    return this;
  }

  public HSLEffectBuilder setSat(int sat) {
    this.sat = sat;
    return this;
  }

  public HSLEffectBuilder from(HSLEffectModel value) {
    this.hue = value.getHue();
    this.lum = value.getLum();
    this.sat = value.getSat();
    return this;
  }

  public HSLEffectModel build() {
    return new HSLEffectModel(this.hue, this.lum, this.sat);
  }
}
