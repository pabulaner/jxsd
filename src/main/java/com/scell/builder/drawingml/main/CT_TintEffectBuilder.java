package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TintEffectModel;
import com.scell.model.drawingml.main.ST_FixedPercentageModel;
import com.scell.model.drawingml.main.ST_PositiveFixedAngleModel;

public class CT_TintEffectBuilder {
  private ST_PositiveFixedAngleModel hue;

  private ST_FixedPercentageModel amt;

  public CT_TintEffectBuilder() {
  }

  public CT_TintEffectBuilder setHue(ST_PositiveFixedAngleModel hue) {
    this.hue = hue;
    return this;
  }

  public CT_TintEffectBuilder setAmt(ST_FixedPercentageModel amt) {
    this.amt = amt;
    return this;
  }

  public CT_TintEffectModel build() {
    return new CT_TintEffectModel(this.hue, this.amt);
  }

  public CT_TintEffectBuilder from(CT_TintEffectModel value) {
    this.hue = value.getHue();
    this.amt = value.getAmt();
    return this;
  }
}
