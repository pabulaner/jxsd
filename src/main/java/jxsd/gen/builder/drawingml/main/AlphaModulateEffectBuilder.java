package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaModulateEffectModel;
import jxsd.gen.model.drawingml.main.EffectContainerModel;

/**
 * This is a generated sequence class.
 */
public class AlphaModulateEffectBuilder {
  private EffectContainerModel cont;

  public AlphaModulateEffectBuilder() {
  }

  public AlphaModulateEffectBuilder setCont(EffectContainerModel cont) {
    this.cont = cont;
    return this;
  }

  public AlphaModulateEffectBuilder from(AlphaModulateEffectModel value) {
    this.cont = value.getCont();
    return this;
  }

  public AlphaModulateEffectModel build() {
    return new AlphaModulateEffectModel(this.cont);
  }
}
