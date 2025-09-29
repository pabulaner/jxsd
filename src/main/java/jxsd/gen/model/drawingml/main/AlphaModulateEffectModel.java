package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.AlphaModulateEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class AlphaModulateEffectModel {
  private final EffectContainerModel cont;

  public AlphaModulateEffectModel(EffectContainerModel cont) {
    this.cont = cont;
  }

  public AlphaModulateEffectBuilder builder() {
    return new AlphaModulateEffectBuilder().from(this);
  }

  public EffectContainerModel getCont() {
    return this.cont;
  }
}
