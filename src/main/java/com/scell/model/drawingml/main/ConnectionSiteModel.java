package com.scell.model.drawingml.main;

public class ConnectionSiteModel {
  private final AdjAngleModel ang;

  private final AdjPoint2DModel pos;

  public ConnectionSiteModel(AdjAngleModel ang, AdjPoint2DModel pos) {
    this.ang = ang;
    this.pos = pos;
  }

  public AdjAngleModel getAng() {
    return this.ang;
  }

  public AdjPoint2DModel getPos() {
    return this.pos;
  }
}
