package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_SoftEdgesEffectModel;
import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;

public class CT_SoftEdgesEffectBuilder {
  private ST_PositiveCoordinateModel rad;

  public CT_SoftEdgesEffectBuilder() {
  }

  public CT_SoftEdgesEffectBuilder setRad(ST_PositiveCoordinateModel rad) {
    this.rad = rad;
    return this;
  }

  public CT_SoftEdgesEffectModel build() {
    return new CT_SoftEdgesEffectModel(this.rad);
  }

  public CT_SoftEdgesEffectBuilder from(CT_SoftEdgesEffectModel value) {
    this.rad = value.getRad();
    return this;
  }
}
