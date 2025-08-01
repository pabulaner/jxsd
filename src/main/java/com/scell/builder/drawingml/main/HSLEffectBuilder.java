package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FixedPercentageValueModel;
import com.scell.model.drawingml.main.HSLEffectModel;
import com.scell.model.drawingml.main.PositiveFixedAngleValueModel;

public class HSLEffectBuilder {
  private PositiveFixedAngleValueModel hue;

  private FixedPercentageValueModel lum;

  private FixedPercentageValueModel sat;

  public HSLEffectBuilder() {
  }

  public HSLEffectBuilder setHue(PositiveFixedAngleValueModel hue) {
    this.hue = hue;
    return this;
  }

  public HSLEffectBuilder setLum(FixedPercentageValueModel lum) {
    this.lum = lum;
    return this;
  }

  public HSLEffectBuilder setSat(FixedPercentageValueModel sat) {
    this.sat = sat;
    return this;
  }

  public HSLEffectModel build() {
    return new HSLEffectModel(this.hue, this.lum, this.sat);
  }

  public HSLEffectBuilder from(HSLEffectModel value) {
    this.hue = value.getHue();
    this.lum = value.getLum();
    this.sat = value.getSat();
    return this;
  }
}
