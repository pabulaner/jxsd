package model.drawingml.main;

import model.XMLSchema.booleanModel;

public class CT_LinearShadePropertiesModel {
  private final booleanModel scaled;

  private final ST_PositiveFixedAngleModel ang;

  public CT_LinearShadePropertiesModel(booleanModel scaled, ST_PositiveFixedAngleModel ang) {
    this.scaled = scaled;
    this.ang = ang;
  }

  public booleanModel getScaled() {
    return this.scaled;
  }

  public ST_PositiveFixedAngleModel getAng() {
    return this.ang;
  }
}
