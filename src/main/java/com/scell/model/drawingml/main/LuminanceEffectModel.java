package com.scell.model.drawingml.main;

public class LuminanceEffectModel {
  private final FixedPercentageValueModel contrast;

  private final FixedPercentageValueModel bright;

  public LuminanceEffectModel(FixedPercentageValueModel contrast,
      FixedPercentageValueModel bright) {
    this.contrast = contrast;
    this.bright = bright;
  }

  public FixedPercentageValueModel getContrast() {
    return this.contrast;
  }

  public FixedPercentageValueModel getBright() {
    return this.bright;
  }
}
