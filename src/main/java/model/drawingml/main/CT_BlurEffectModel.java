package model.drawingml.main;

import model.XMLSchema.booleanModel;

public class CT_BlurEffectModel {
  private final ST_PositiveCoordinateModel rad;

  private final booleanModel grow;

  public CT_BlurEffectModel(ST_PositiveCoordinateModel rad, booleanModel grow) {
    this.rad = rad;
    this.grow = grow;
  }

  public ST_PositiveCoordinateModel getRad() {
    return this.rad;
  }

  public booleanModel getGrow() {
    return this.grow;
  }
}
