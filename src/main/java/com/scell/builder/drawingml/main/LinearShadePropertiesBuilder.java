package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.LinearShadePropertiesModel;
import com.scell.model.drawingml.main.PositiveFixedAngleModel;

public class LinearShadePropertiesBuilder {
  private BooleanModel scaled;

  private PositiveFixedAngleModel ang;

  public LinearShadePropertiesBuilder() {
  }

  public LinearShadePropertiesBuilder setScaled(BooleanModel scaled) {
    this.scaled = scaled;
    return this;
  }

  public LinearShadePropertiesBuilder setAng(PositiveFixedAngleModel ang) {
    this.ang = ang;
    return this;
  }

  public LinearShadePropertiesModel build() {
    return new LinearShadePropertiesModel(this.scaled, this.ang);
  }

  public LinearShadePropertiesBuilder from(LinearShadePropertiesModel value) {
    this.scaled = value.getScaled();
    this.ang = value.getAng();
    return this;
  }
}
