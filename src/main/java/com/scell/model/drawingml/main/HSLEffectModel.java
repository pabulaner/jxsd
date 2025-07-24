package com.scell.model.drawingml.main;

public class HSLEffectModel {
  private final PositiveFixedAngleModel hue;

  private final FixedPercentageModel lum;

  private final FixedPercentageModel sat;

  public HSLEffectModel(PositiveFixedAngleModel hue, FixedPercentageModel lum,
      FixedPercentageModel sat) {
    this.hue = hue;
    this.lum = lum;
    this.sat = sat;
  }

  public PositiveFixedAngleModel getHue() {
    return this.hue;
  }

  public FixedPercentageModel getLum() {
    return this.lum;
  }

  public FixedPercentageModel getSat() {
    return this.sat;
  }
}
