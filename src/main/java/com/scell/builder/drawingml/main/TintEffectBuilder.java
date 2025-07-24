package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FixedPercentageModel;
import com.scell.model.drawingml.main.PositiveFixedAngleModel;
import com.scell.model.drawingml.main.TintEffectModel;

public class TintEffectBuilder {
  private PositiveFixedAngleModel hue;

  private FixedPercentageModel amt;

  public TintEffectBuilder() {
  }

  public TintEffectBuilder setHue(PositiveFixedAngleModel hue) {
    this.hue = hue;
    return this;
  }

  public TintEffectBuilder setAmt(FixedPercentageModel amt) {
    this.amt = amt;
    return this;
  }

  public TintEffectModel build() {
    return new TintEffectModel(this.hue, this.amt);
  }

  public TintEffectBuilder from(TintEffectModel value) {
    this.hue = value.getHue();
    this.amt = value.getAmt();
    return this;
  }
}
