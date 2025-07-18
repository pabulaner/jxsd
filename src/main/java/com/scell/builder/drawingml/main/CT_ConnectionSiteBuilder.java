package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjPoint2DModel;
import com.scell.model.drawingml.main.CT_ConnectionSiteModel;
import com.scell.model.drawingml.main.ST_AdjAngleModel;

public class CT_ConnectionSiteBuilder {
  private ST_AdjAngleModel ang;

  private CT_AdjPoint2DModel pos;

  public CT_ConnectionSiteBuilder() {
  }

  public CT_ConnectionSiteBuilder setAng(ST_AdjAngleModel ang) {
    this.ang = ang;
    return this;
  }

  public CT_ConnectionSiteBuilder setPos(CT_AdjPoint2DModel pos) {
    this.pos = pos;
    return this;
  }

  public CT_ConnectionSiteModel build() {
    return new CT_ConnectionSiteModel(this.ang, this.pos);
  }

  public CT_ConnectionSiteBuilder from(CT_ConnectionSiteModel value) {
    this.ang = value.getAng();
    this.pos = value.getPos();
    return this;
  }
}
