package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_LinearShadePropertiesModel;
import com.scell.model.drawingml.main.ST_PositiveFixedAngleModel;

public class CT_LinearShadePropertiesBuilder {
  private BooleanModel scaled;

  private ST_PositiveFixedAngleModel ang;

  public CT_LinearShadePropertiesBuilder() {
  }

  public CT_LinearShadePropertiesBuilder setScaled(BooleanModel scaled) {
    this.scaled = scaled;
    return this;
  }

  public CT_LinearShadePropertiesBuilder setAng(ST_PositiveFixedAngleModel ang) {
    this.ang = ang;
    return this;
  }

  public CT_LinearShadePropertiesModel build() {
    return new CT_LinearShadePropertiesModel(this.scaled, this.ang);
  }

  public CT_LinearShadePropertiesBuilder from(CT_LinearShadePropertiesModel value) {
    this.scaled = value.getScaled();
    this.ang = value.getAng();
    return this;
  }
}
