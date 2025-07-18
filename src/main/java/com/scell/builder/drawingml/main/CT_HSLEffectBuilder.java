package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_HSLEffectModel;
import com.scell.model.drawingml.main.ST_FixedPercentageModel;
import com.scell.model.drawingml.main.ST_PositiveFixedAngleModel;

public class CT_HSLEffectBuilder {
  private ST_PositiveFixedAngleModel hue;

  private ST_FixedPercentageModel lum;

  private ST_FixedPercentageModel sat;

  public CT_HSLEffectBuilder() {
  }

  public CT_HSLEffectBuilder setHue(ST_PositiveFixedAngleModel hue) {
    this.hue = hue;
    return this;
  }

  public CT_HSLEffectBuilder setLum(ST_FixedPercentageModel lum) {
    this.lum = lum;
    return this;
  }

  public CT_HSLEffectBuilder setSat(ST_FixedPercentageModel sat) {
    this.sat = sat;
    return this;
  }

  public CT_HSLEffectModel build() {
    return new CT_HSLEffectModel(this.hue, this.lum, this.sat);
  }

  public CT_HSLEffectBuilder from(CT_HSLEffectModel value) {
    this.hue = value.getHue();
    this.lum = value.getLum();
    this.sat = value.getSat();
    return this;
  }
}
