package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;

public class BlurEffectModel {
  private final PositiveCoordinateValueModel rad;

  private final BooleanValueModel grow;

  public BlurEffectModel(PositiveCoordinateValueModel rad, BooleanValueModel grow) {
    this.rad = rad;
    this.grow = grow;
  }

  public PositiveCoordinateValueModel getRad() {
    return this.rad;
  }

  public BooleanValueModel getGrow() {
    return this.grow;
  }
}
