package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.AlphaReplaceEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class AlphaReplaceEffectModel {
  private final int a;

  public AlphaReplaceEffectModel(int a) {
    this.a = a;
  }

  public AlphaReplaceEffectBuilder builder() {
    return new AlphaReplaceEffectBuilder().from(this);
  }

  public int getA() {
    return this.a;
  }
}
