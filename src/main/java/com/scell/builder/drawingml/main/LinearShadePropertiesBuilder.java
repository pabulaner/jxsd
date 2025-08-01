package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.LinearShadePropertiesModel;
import com.scell.model.drawingml.main.PositiveFixedAngleValueModel;

public class LinearShadePropertiesBuilder {
  private BooleanValueModel scaled;

  private PositiveFixedAngleValueModel ang;

  public LinearShadePropertiesBuilder() {
  }

  public LinearShadePropertiesBuilder setScaled(BooleanValueModel scaled) {
    this.scaled = scaled;
    return this;
  }

  public LinearShadePropertiesBuilder setAng(PositiveFixedAngleValueModel ang) {
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
