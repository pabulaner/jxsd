package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaModulateEffectModel;
import com.scell.model.drawingml.main.CT_EffectContainerModel;

public class CT_AlphaModulateEffectBuilder {
  private CT_EffectContainerModel cont;

  public CT_AlphaModulateEffectBuilder() {
  }

  public CT_AlphaModulateEffectBuilder setCont(CT_EffectContainerModel cont) {
    this.cont = cont;
    return this;
  }

  public CT_AlphaModulateEffectModel build() {
    return new CT_AlphaModulateEffectModel(this.cont);
  }

  public CT_AlphaModulateEffectBuilder from(CT_AlphaModulateEffectModel value) {
    this.cont = value.getCont();
    return this;
  }
}
