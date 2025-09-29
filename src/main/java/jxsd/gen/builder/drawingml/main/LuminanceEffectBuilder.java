package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.LuminanceEffectModel;

/**
 * This is a generated sequence class.
 */
public class LuminanceEffectBuilder {
  private int contrast;

  private int bright;

  public LuminanceEffectBuilder() {
  }

  public LuminanceEffectBuilder setContrast(int contrast) {
    this.contrast = contrast;
    return this;
  }

  public LuminanceEffectBuilder setBright(int bright) {
    this.bright = bright;
    return this;
  }

  public LuminanceEffectBuilder from(LuminanceEffectModel value) {
    this.contrast = value.getContrast();
    this.bright = value.getBright();
    return this;
  }

  public LuminanceEffectModel build() {
    return new LuminanceEffectModel(this.contrast, this.bright);
  }
}
