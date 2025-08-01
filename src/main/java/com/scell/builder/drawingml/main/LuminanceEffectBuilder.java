package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FixedPercentageValueModel;
import com.scell.model.drawingml.main.LuminanceEffectModel;

public class LuminanceEffectBuilder {
  private FixedPercentageValueModel contrast;

  private FixedPercentageValueModel bright;

  public LuminanceEffectBuilder() {
  }

  public LuminanceEffectBuilder setContrast(FixedPercentageValueModel contrast) {
    this.contrast = contrast;
    return this;
  }

  public LuminanceEffectBuilder setBright(FixedPercentageValueModel bright) {
    this.bright = bright;
    return this;
  }

  public LuminanceEffectModel build() {
    return new LuminanceEffectModel(this.contrast, this.bright);
  }

  public LuminanceEffectBuilder from(LuminanceEffectModel value) {
    this.contrast = value.getContrast();
    this.bright = value.getBright();
    return this;
  }
}
