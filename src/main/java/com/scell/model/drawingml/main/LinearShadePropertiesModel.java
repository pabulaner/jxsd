package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;

public class LinearShadePropertiesModel {
  private final BooleanValueModel scaled;

  private final PositiveFixedAngleValueModel ang;

  public LinearShadePropertiesModel(BooleanValueModel scaled, PositiveFixedAngleValueModel ang) {
    this.scaled = scaled;
    this.ang = ang;
  }

  public BooleanValueModel getScaled() {
    return this.scaled;
  }

  public PositiveFixedAngleValueModel getAng() {
    return this.ang;
  }
}
