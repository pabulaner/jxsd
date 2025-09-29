package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaModulateFixedEffectModel;

/**
 * This is a generated sequence class.
 */
public class AlphaModulateFixedEffectBuilder {
  private int amt;

  public AlphaModulateFixedEffectBuilder() {
  }

  public AlphaModulateFixedEffectBuilder setAmt(int amt) {
    this.amt = amt;
    return this;
  }

  public AlphaModulateFixedEffectBuilder from(AlphaModulateFixedEffectModel value) {
    this.amt = value.getAmt();
    return this;
  }

  public AlphaModulateFixedEffectModel build() {
    return new AlphaModulateFixedEffectModel(this.amt);
  }
}
