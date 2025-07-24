package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaModulateFixedEffectModel;
import com.scell.model.drawingml.main.PositivePercentageModel;

public class AlphaModulateFixedEffectBuilder {
  private PositivePercentageModel amt;

  public AlphaModulateFixedEffectBuilder() {
  }

  public AlphaModulateFixedEffectBuilder setAmt(PositivePercentageModel amt) {
    this.amt = amt;
    return this;
  }

  public AlphaModulateFixedEffectModel build() {
    return new AlphaModulateFixedEffectModel(this.amt);
  }

  public AlphaModulateFixedEffectBuilder from(AlphaModulateFixedEffectModel value) {
    this.amt = value.getAmt();
    return this;
  }
}
