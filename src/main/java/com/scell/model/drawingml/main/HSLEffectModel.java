package com.scell.model.drawingml.main;

public class HSLEffectModel {
  private final PositiveFixedAngleValueModel hue;

  private final FixedPercentageValueModel lum;

  private final FixedPercentageValueModel sat;

  public HSLEffectModel(PositiveFixedAngleValueModel hue, FixedPercentageValueModel lum,
      FixedPercentageValueModel sat) {
    this.hue = hue;
    this.lum = lum;
    this.sat = sat;
  }

  public PositiveFixedAngleValueModel getHue() {
    return this.hue;
  }

  public FixedPercentageValueModel getLum() {
    return this.lum;
  }

  public FixedPercentageValueModel getSat() {
    return this.sat;
  }
}
