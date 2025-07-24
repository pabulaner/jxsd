package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;

public class BlurEffectModel {
  private final PositiveCoordinateModel rad;

  private final BooleanModel grow;

  public BlurEffectModel(PositiveCoordinateModel rad, BooleanModel grow) {
    this.rad = rad;
    this.grow = grow;
  }

  public PositiveCoordinateModel getRad() {
    return this.rad;
  }

  public BooleanModel getGrow() {
    return this.grow;
  }
}
