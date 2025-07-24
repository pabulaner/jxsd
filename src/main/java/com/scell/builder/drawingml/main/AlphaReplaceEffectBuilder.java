package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaReplaceEffectModel;
import com.scell.model.drawingml.main.PositiveFixedPercentageModel;

public class AlphaReplaceEffectBuilder {
  private PositiveFixedPercentageModel a;

  public AlphaReplaceEffectBuilder() {
  }

  public AlphaReplaceEffectBuilder setA(PositiveFixedPercentageModel a) {
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
