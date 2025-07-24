package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaFloorEffectModel;

public class AlphaFloorEffectBuilder {
  public AlphaFloorEffectBuilder() {
  }

  public AlphaFloorEffectModel build() {
    return new AlphaFloorEffectModel();
  }

  public AlphaFloorEffectBuilder from(AlphaFloorEffectModel value) {
    return this;
  }
}
