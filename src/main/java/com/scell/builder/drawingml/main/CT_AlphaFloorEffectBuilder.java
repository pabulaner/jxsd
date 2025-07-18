package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaFloorEffectModel;

public class CT_AlphaFloorEffectBuilder {
  public CT_AlphaFloorEffectBuilder() {
  }

  public CT_AlphaFloorEffectModel build() {
    return new CT_AlphaFloorEffectModel();
  }

  public CT_AlphaFloorEffectBuilder from(CT_AlphaFloorEffectModel value) {
    return this;
  }
}
