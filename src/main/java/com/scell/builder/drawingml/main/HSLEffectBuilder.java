package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FixedPercentageModel;
import com.scell.model.drawingml.main.HSLEffectModel;
import com.scell.model.drawingml.main.PositiveFixedAngleModel;

public class HSLEffectBuilder {
  private PositiveFixedAngleModel hue;

  private FixedPercentageModel lum;

  private FixedPercentageModel sat;

  public HSLEffectBuilder() {
  }

  public HSLEffectBuilder setHue(PositiveFixedAngleModel hue) {
    this.hue = hue;
    return this;
  }

  public HSLEffectBuilder setLum(FixedPercentageModel lum) {
    this.lum = lum;
    return this;
  }

  public HSLEffectBuilder setSat(FixedPercentageModel sat) {
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
