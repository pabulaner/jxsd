package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveCoordinateValueModel;
import com.scell.model.drawingml.main.SoftEdgesEffectModel;

public class SoftEdgesEffectBuilder {
  private PositiveCoordinateValueModel rad;

  public SoftEdgesEffectBuilder() {
  }

  public SoftEdgesEffectBuilder setRad(PositiveCoordinateValueModel rad) {
    this.rad = rad;
    return this;
  }

  public SoftEdgesEffectModel build() {
    return new SoftEdgesEffectModel(this.rad);
  }

  public SoftEdgesEffectBuilder from(SoftEdgesEffectModel value) {
    this.rad = value.getRad();
    return this;
  }
}
