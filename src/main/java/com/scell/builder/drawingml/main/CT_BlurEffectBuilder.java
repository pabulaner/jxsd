package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_BlurEffectModel;
import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;

public class CT_BlurEffectBuilder {
  private ST_PositiveCoordinateModel rad;

  private BooleanModel grow;

  public CT_BlurEffectBuilder() {
  }

  public CT_BlurEffectBuilder setRad(ST_PositiveCoordinateModel rad) {
    this.rad = rad;
    return this;
  }

  public CT_BlurEffectBuilder setGrow(BooleanModel grow) {
    this.grow = grow;
    return this;
  }

  public CT_BlurEffectModel build() {
    return new CT_BlurEffectModel(this.rad, this.grow);
  }

  public CT_BlurEffectBuilder from(CT_BlurEffectModel value) {
    this.rad = value.getRad();
    this.grow = value.getGrow();
    return this;
  }
}
