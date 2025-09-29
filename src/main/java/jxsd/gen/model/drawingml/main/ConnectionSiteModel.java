package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.ConnectionSiteBuilder;

/**
 * This is a generated sequence class.
 */
public class ConnectionSiteModel {
  private final AdjAngleValueModel ang;

  private final AdjPoint2DModel pos;

  public ConnectionSiteModel(AdjAngleValueModel ang, AdjPoint2DModel pos) {
    this.ang = ang;
    this.pos = pos;
  }

  public ConnectionSiteBuilder builder() {
    return new ConnectionSiteBuilder().from(this);
  }

  public AdjAngleValueModel getAng() {
    return this.ang;
  }

  public AdjPoint2DModel getPos() {
    return this.pos;
  }
}
