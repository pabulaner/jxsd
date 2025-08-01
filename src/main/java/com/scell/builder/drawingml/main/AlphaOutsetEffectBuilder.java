package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaOutsetEffectModel;
import com.scell.model.drawingml.main.CoordinateValueModel;

public class AlphaOutsetEffectBuilder {
  private CoordinateValueModel rad;

  public AlphaOutsetEffectBuilder() {
  }

  public AlphaOutsetEffectBuilder setRad(CoordinateValueModel rad) {
    this.rad = rad;
    return this;
  }

  public AlphaOutsetEffectModel build() {
    return new AlphaOutsetEffectModel(this.rad);
  }

  public AlphaOutsetEffectBuilder from(AlphaOutsetEffectModel value) {
    this.rad = value.getRad();
    return this;
  }
}
