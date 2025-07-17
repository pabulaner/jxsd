package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BlendEffectModel;
import com.scell.model.drawingml.main.CT_EffectContainerModel;
import com.scell.model.drawingml.main.ST_BlendModeModel;

public class CT_BlendEffectBuilder {
  private ST_BlendModeModel blend;

  private CT_EffectContainerModel cont;

  public CT_BlendEffectBuilder() {
  }

  public CT_BlendEffectBuilder setBlend(ST_BlendModeModel blend) {
    this.blend = blend;
    return this;
  }

  public CT_BlendEffectBuilder setCont(CT_EffectContainerModel cont) {
    this.cont = cont;
    return this;
  }

  public CT_BlendEffectModel build() {
    return new CT_BlendEffectModel(this.blend, this.cont);
  }

  public CT_BlendEffectBuilder from(CT_BlendEffectModel value) {
    this.blend = value.getBlend();
    this.cont = value.getCont();
    return this;
  }
}
