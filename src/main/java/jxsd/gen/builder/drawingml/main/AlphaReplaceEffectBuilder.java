package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaReplaceEffectModel;

/**
 * This is a generated sequence class.
 */
public class AlphaReplaceEffectBuilder {
  private int a;

  public AlphaReplaceEffectBuilder() {
  }

  public AlphaReplaceEffectBuilder setA(int a) {
    this.a = a;
    return this;
  }

  public AlphaReplaceEffectBuilder from(AlphaReplaceEffectModel value) {
    this.a = value.getA();
    return this;
  }

  public AlphaReplaceEffectModel build() {
    return new AlphaReplaceEffectModel(this.a);
  }
}
