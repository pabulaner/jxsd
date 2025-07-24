package com.scell.model.drawingml.main;

public class LuminanceEffectModel {
  private final FixedPercentageModel contrast;

  private final FixedPercentageModel bright;

  public LuminanceEffectModel(FixedPercentageModel contrast, FixedPercentageModel bright) {
    this.contrast = contrast;
    this.bright = bright;
  }

  public FixedPercentageModel getContrast() {
    return this.contrast;
  }

  public FixedPercentageModel getBright() {
    return this.bright;
  }
}
