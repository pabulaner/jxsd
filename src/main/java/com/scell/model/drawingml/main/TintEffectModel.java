package com.scell.model.drawingml.main;

public class TintEffectModel {
  private final PositiveFixedAngleModel hue;

  private final FixedPercentageModel amt;

  public TintEffectModel(PositiveFixedAngleModel hue, FixedPercentageModel amt) {
    this.hue = hue;
    this.amt = amt;
  }

  public PositiveFixedAngleModel getHue() {
    return this.hue;
  }

  public FixedPercentageModel getAmt() {
    return this.amt;
  }
}
