package com.scell.model.drawingml.main;

public class CT_ConnectionSiteModel {
  private final ST_AdjAngleModel ang;

  private final CT_AdjPoint2DModel pos;

  public CT_ConnectionSiteModel(ST_AdjAngleModel ang, CT_AdjPoint2DModel pos) {
    this.ang = ang;
    this.pos = pos;
  }

  public ST_AdjAngleModel getAng() {
    return this.ang;
  }

  public CT_AdjPoint2DModel getPos() {
    return this.pos;
  }
}
