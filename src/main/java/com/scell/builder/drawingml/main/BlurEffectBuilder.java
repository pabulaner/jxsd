package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.BlurEffectModel;
import com.scell.model.drawingml.main.PositiveCoordinateValueModel;

public class BlurEffectBuilder {
  private PositiveCoordinateValueModel rad;

  private BooleanValueModel grow;

  public BlurEffectBuilder() {
  }

  public BlurEffectBuilder setRad(PositiveCoordinateValueModel rad) {
    this.rad = rad;
    return this;
  }

  public BlurEffectBuilder setGrow(BooleanValueModel grow) {
    this.grow = grow;
    return this;
  }

  public BlurEffectModel build() {
    return new BlurEffectModel(this.rad, this.grow);
  }

  public BlurEffectBuilder from(BlurEffectModel value) {
    this.rad = value.getRad();
    this.grow = value.getGrow();
    return this;
  }
}
