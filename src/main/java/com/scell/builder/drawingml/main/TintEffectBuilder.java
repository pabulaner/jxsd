package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FixedPercentageValueModel;
import com.scell.model.drawingml.main.PositiveFixedAngleValueModel;
import com.scell.model.drawingml.main.TintEffectModel;

public class TintEffectBuilder {
  private PositiveFixedAngleValueModel hue;

  private FixedPercentageValueModel amt;

  public TintEffectBuilder() {
  }

  public TintEffectBuilder setHue(PositiveFixedAngleValueModel hue) {
    this.hue = hue;
    return this;
  }

  public TintEffectBuilder setAmt(FixedPercentageValueModel amt) {
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
