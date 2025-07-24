package com.scell.model.drawingml.main;

public class BlendEffectModel {
  private final BlendModeModel blend;

  private final EffectContainerModel cont;

  public BlendEffectModel(BlendModeModel blend, EffectContainerModel cont) {
    this.blend = blend;
    this.cont = cont;
  }

  public BlendModeModel getBlend() {
    return this.blend;
  }

  public EffectContainerModel getCont() {
    return this.cont;
  }
}
