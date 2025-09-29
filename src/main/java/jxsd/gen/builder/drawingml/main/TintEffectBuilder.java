package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TintEffectModel;

/**
 * This is a generated sequence class.
 */
public class TintEffectBuilder {
  private int hue;

  private int amt;

  public TintEffectBuilder() {
  }

  public TintEffectBuilder setHue(int hue) {
    this.hue = hue;
    return this;
  }

  public TintEffectBuilder setAmt(int amt) {
    this.amt = amt;
    return this;
  }

  public TintEffectBuilder from(TintEffectModel value) {
    this.hue = value.getHue();
    this.amt = value.getAmt();
    return this;
  }

  public TintEffectModel build() {
    return new TintEffectModel(this.hue, this.amt);
  }
}
