package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TintEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class TintEffectModel {
  private final int hue;

  private final int amt;

  public TintEffectModel(int hue, int amt) {
    this.hue = hue;
    this.amt = amt;
  }

  public TintEffectBuilder builder() {
    return new TintEffectBuilder().from(this);
  }

  public int getHue() {
    return this.hue;
  }

  public int getAmt() {
    return this.amt;
  }
}
