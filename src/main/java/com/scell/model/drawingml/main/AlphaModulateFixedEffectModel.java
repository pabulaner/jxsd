package com.scell.model.drawingml.main;

public class AlphaModulateFixedEffectModel {
  private final PositivePercentageModel amt;

  public AlphaModulateFixedEffectModel(PositivePercentageModel amt) {
    this.amt = amt;
  }

  public PositivePercentageModel getAmt() {
    return this.amt;
  }
}
