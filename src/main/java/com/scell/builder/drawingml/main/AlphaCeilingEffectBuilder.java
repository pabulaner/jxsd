package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaCeilingEffectModel;

public class AlphaCeilingEffectBuilder {
  public AlphaCeilingEffectBuilder() {
  }

  public AlphaCeilingEffectModel build() {
    return new AlphaCeilingEffectModel();
  }

  public AlphaCeilingEffectBuilder from(AlphaCeilingEffectModel value) {
    return this;
  }
}
