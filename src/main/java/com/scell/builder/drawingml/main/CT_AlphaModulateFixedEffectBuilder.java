package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaModulateFixedEffectModel;
import com.scell.model.drawingml.main.ST_PositivePercentageModel;

public class CT_AlphaModulateFixedEffectBuilder {
  private ST_PositivePercentageModel amt;

  public CT_AlphaModulateFixedEffectBuilder() {
  }

  public CT_AlphaModulateFixedEffectBuilder setAmt(ST_PositivePercentageModel amt) {
    this.amt = amt;
    return this;
  }

  public CT_AlphaModulateFixedEffectModel build() {
    return new CT_AlphaModulateFixedEffectModel(this.amt);
  }

  public CT_AlphaModulateFixedEffectBuilder from(CT_AlphaModulateFixedEffectModel value) {
    this.amt = value.getAmt();
    return this;
  }
}
