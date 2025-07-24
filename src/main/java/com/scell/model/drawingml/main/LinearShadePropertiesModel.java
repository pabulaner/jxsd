package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;

public class LinearShadePropertiesModel {
  private final BooleanModel scaled;

  private final PositiveFixedAngleModel ang;

  public LinearShadePropertiesModel(BooleanModel scaled, PositiveFixedAngleModel ang) {
    this.scaled = scaled;
    this.ang = ang;
  }

  public BooleanModel getScaled() {
    return this.scaled;
  }

  public PositiveFixedAngleModel getAng() {
    return this.ang;
  }
}
