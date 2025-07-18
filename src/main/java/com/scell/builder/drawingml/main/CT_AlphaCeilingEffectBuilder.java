package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaCeilingEffectModel;

public class CT_AlphaCeilingEffectBuilder {
  public CT_AlphaCeilingEffectBuilder() {
  }

  public CT_AlphaCeilingEffectModel build() {
    return new CT_AlphaCeilingEffectModel();
  }

  public CT_AlphaCeilingEffectBuilder from(CT_AlphaCeilingEffectModel value) {
    return this;
  }
}
