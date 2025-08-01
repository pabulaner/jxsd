package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaReplaceEffectModel;
import com.scell.model.drawingml.main.PositiveFixedPercentageValueModel;

public class AlphaReplaceEffectBuilder {
  private PositiveFixedPercentageValueModel a;

  public AlphaReplaceEffectBuilder() {
  }

  public AlphaReplaceEffectBuilder setA(PositiveFixedPercentageValueModel a) {
    this.a = a;
    return this;
  }

  public AlphaReplaceEffectModel build() {
    return new AlphaReplaceEffectModel(this.a);
  }

  public AlphaReplaceEffectBuilder from(AlphaReplaceEffectModel value) {
    this.a = value.getA();
    return this;
  }
}
