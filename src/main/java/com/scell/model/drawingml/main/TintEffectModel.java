package com.scell.model.drawingml.main;

public class TintEffectModel {
  private final PositiveFixedAngleValueModel hue;

  private final FixedPercentageValueModel amt;

  public TintEffectModel(PositiveFixedAngleValueModel hue, FixedPercentageValueModel amt) {
    this.hue = hue;
    this.amt = amt;
  }

  public PositiveFixedAngleValueModel getHue() {
    return this.hue;
  }

  public FixedPercentageValueModel getAmt() {
    return this.amt;
  }
}
