package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.BlendEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class BlendEffectModel {
  private final BlendModeValueModel blend;

  private final EffectContainerModel cont;

  public BlendEffectModel(BlendModeValueModel blend, EffectContainerModel cont) {
    this.blend = blend;
    this.cont = cont;
  }

  public BlendEffectBuilder builder() {
    return new BlendEffectBuilder().from(this);
  }

  public BlendModeValueModel getBlend() {
    return this.blend;
  }

  public EffectContainerModel getCont() {
    return this.cont;
  }
}
