package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_LuminanceEffectModel;
import com.scell.model.drawingml.main.ST_FixedPercentageModel;

public class CT_LuminanceEffectBuilder {
  private ST_FixedPercentageModel contrast;

  private ST_FixedPercentageModel bright;

  public CT_LuminanceEffectBuilder() {
  }

  public CT_LuminanceEffectBuilder setContrast(ST_FixedPercentageModel contrast) {
    this.contrast = contrast;
    return this;
  }

  public CT_LuminanceEffectBuilder setBright(ST_FixedPercentageModel bright) {
    this.bright = bright;
    return this;
  }

  public CT_LuminanceEffectModel build() {
    return new CT_LuminanceEffectModel(this.contrast, this.bright);
  }

  public CT_LuminanceEffectBuilder from(CT_LuminanceEffectModel value) {
    this.contrast = value.getContrast();
    this.bright = value.getBright();
    return this;
  }
}
