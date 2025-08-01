package com.scell.model.drawingml.main;

public class AlphaModulateFixedEffectModel {
  private final PositivePercentageValueModel amt;

  public AlphaModulateFixedEffectModel(PositivePercentageValueModel amt) {
    this.amt = amt;
  }

  public PositivePercentageValueModel getAmt() {
    return this.amt;
  }
}
