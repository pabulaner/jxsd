package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.BlurEffectModel;
import com.scell.model.drawingml.main.PositiveCoordinateModel;

public class BlurEffectBuilder {
  private PositiveCoordinateModel rad;

  private BooleanModel grow;

  public BlurEffectBuilder() {
  }

  public BlurEffectBuilder setRad(PositiveCoordinateModel rad) {
    this.rad = rad;
    return this;
  }

  public BlurEffectBuilder setGrow(BooleanModel grow) {
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
