package com.scell.model.drawingml.main;

public class BlendEffectModel {
  private final BlendModeValueModel blend;

  private final EffectContainerModel cont;

  public BlendEffectModel(BlendModeValueModel blend, EffectContainerModel cont) {
    this.blend = blend;
    this.cont = cont;
  }

  public BlendModeValueModel getBlend() {
    return this.blend;
  }

  public EffectContainerModel getCont() {
    return this.cont;
  }
}
