package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaOutsetEffectModel;
import com.scell.model.drawingml.main.ST_CoordinateModel;

public class CT_AlphaOutsetEffectBuilder {
  private ST_CoordinateModel rad;

  public CT_AlphaOutsetEffectBuilder() {
  }

  public CT_AlphaOutsetEffectBuilder setRad(ST_CoordinateModel rad) {
    this.rad = rad;
    return this;
  }

  public CT_AlphaOutsetEffectModel build() {
    return new CT_AlphaOutsetEffectModel(this.rad);
  }

  public CT_AlphaOutsetEffectBuilder from(CT_AlphaOutsetEffectModel value) {
    this.rad = value.getRad();
    return this;
  }
}
