package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaReplaceEffectModel;
import com.scell.model.drawingml.main.ST_PositiveFixedPercentageModel;

public class CT_AlphaReplaceEffectBuilder {
  private ST_PositiveFixedPercentageModel a;

  public CT_AlphaReplaceEffectBuilder() {
  }

  public CT_AlphaReplaceEffectBuilder setA(ST_PositiveFixedPercentageModel a) {
    this.a = a;
    return this;
  }

  public CT_AlphaReplaceEffectModel build() {
    return new CT_AlphaReplaceEffectModel(this.a);
  }

  public CT_AlphaReplaceEffectBuilder from(CT_AlphaReplaceEffectModel value) {
    this.a = value.getA();
    return this;
  }
}
