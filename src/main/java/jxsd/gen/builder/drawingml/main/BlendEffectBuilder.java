package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BlendEffectModel;
import jxsd.gen.model.drawingml.main.BlendModeValueModel;
import jxsd.gen.model.drawingml.main.EffectContainerModel;

/**
 * This is a generated sequence class.
 */
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

  public BlendEffectBuilder from(BlendEffectModel value) {
    this.blend = value.getBlend();
    this.cont = value.getCont();
    return this;
  }

  public BlendEffectModel build() {
    return new BlendEffectModel(this.blend, this.cont);
  }
}
