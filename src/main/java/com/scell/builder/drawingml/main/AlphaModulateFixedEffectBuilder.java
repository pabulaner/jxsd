package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaModulateFixedEffectModel;
import com.scell.model.drawingml.main.PositivePercentageValueModel;

public class AlphaModulateFixedEffectBuilder {
  private PositivePercentageValueModel amt;

  public AlphaModulateFixedEffectBuilder() {
  }

  public AlphaModulateFixedEffectBuilder setAmt(PositivePercentageValueModel amt) {
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
