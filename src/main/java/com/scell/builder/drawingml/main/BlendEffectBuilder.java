package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlendEffectModel;
import com.scell.model.drawingml.main.BlendModeValueModel;
import com.scell.model.drawingml.main.EffectContainerModel;

public class BlendEffectBuilder {
  private BlendModeValueModel blend;

  private EffectContainerModel cont;

  public BlendEffectBuilder() {
  }

  public BlendEffectBuilder setBlend(BlendModeValueModel blend) {
    this.blend = blend;
    return this;
  }

  public BlendEffectBuilder setCont(EffectContainerModel cont) {
    this.cont = cont;
    return this;
  }

  public BlendEffectModel build() {
    return new BlendEffectModel(this.blend, this.cont);
  }

  public BlendEffectBuilder from(BlendEffectModel value) {
    this.blend = value.getBlend();
    this.cont = value.getCont();
    return this;
  }
}
