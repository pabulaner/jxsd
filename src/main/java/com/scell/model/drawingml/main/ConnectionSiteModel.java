package com.scell.model.drawingml.main;

public class ConnectionSiteModel {
  private final AdjAngleValueModel ang;

  private final AdjPoint2DModel pos;

  public ConnectionSiteModel(AdjAngleValueModel ang, AdjPoint2DModel pos) {
    this.ang = ang;
    this.pos = pos;
  }

  public AdjAngleValueModel getAng() {
    return this.ang;
  }

  public AdjPoint2DModel getPos() {
    return this.pos;
  }
}
