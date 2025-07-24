package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FixedPercentageModel;
import com.scell.model.drawingml.main.LuminanceEffectModel;

public class LuminanceEffectBuilder {
  private FixedPercentageModel contrast;

  private FixedPercentageModel bright;

  public LuminanceEffectBuilder() {
  }

  public LuminanceEffectBuilder setContrast(FixedPercentageModel contrast) {
    this.contrast = contrast;
    return this;
  }

  public LuminanceEffectBuilder setBright(FixedPercentageModel bright) {
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
