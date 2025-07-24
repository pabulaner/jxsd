package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaModulateEffectModel;
import com.scell.model.drawingml.main.EffectContainerModel;

public class AlphaModulateEffectBuilder {
  private EffectContainerModel cont;

  public AlphaModulateEffectBuilder() {
  }

  public AlphaModulateEffectBuilder setCont(EffectContainerModel cont) {
    this.cont = cont;
    return this;
  }

  public AlphaModulateEffectModel build() {
    return new AlphaModulateEffectModel(this.cont);
  }

  public AlphaModulateEffectBuilder from(AlphaModulateEffectModel value) {
    this.cont = value.getCont();
    return this;
  }
}
