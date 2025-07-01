package test.drawingml.main;

import test.XMLSchema.BooleanModel;

public class CTBlurEffectModel {
  private final STPositiveCoordinateModel rad;

  private final BooleanModel grow;

  public CTBlurEffectModel(STPositiveCoordinateModel rad, BooleanModel grow) {
    this.rad = rad;
    this.grow = grow;
  }

  public STPositiveCoordinateModel getRad() {
    return this.rad;
  }

  public BooleanModel getGrow() {
    return this.grow;
  }
}
