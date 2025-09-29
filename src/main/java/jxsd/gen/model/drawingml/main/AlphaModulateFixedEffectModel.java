package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.AlphaModulateFixedEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class AlphaModulateFixedEffectModel {
  private final int amt;

  public AlphaModulateFixedEffectModel(int amt) {
    this.amt = amt;
  }

  public AlphaModulateFixedEffectBuilder builder() {
    return new AlphaModulateFixedEffectBuilder().from(this);
  }

  public int getAmt() {
    return this.amt;
  }
}
