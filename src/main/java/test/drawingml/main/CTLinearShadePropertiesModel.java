package test.drawingml.main;

import test.XMLSchema.BooleanModel;

public class CTLinearShadePropertiesModel {
  private final BooleanModel scaled;

  private final STPositiveFixedAngleModel ang;

  public CTLinearShadePropertiesModel(BooleanModel scaled, STPositiveFixedAngleModel ang) {
    this.scaled = scaled;
    this.ang = ang;
  }

  public BooleanModel getScaled() {
    return this.scaled;
  }

  public STPositiveFixedAngleModel getAng() {
    return this.ang;
  }
}
