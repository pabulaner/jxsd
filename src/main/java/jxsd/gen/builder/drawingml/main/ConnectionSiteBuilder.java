package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AdjAngleValueModel;
import jxsd.gen.model.drawingml.main.AdjPoint2DModel;
import jxsd.gen.model.drawingml.main.ConnectionSiteModel;

/**
 * This is a generated sequence class.
 */
public class ConnectionSiteBuilder {
  private AdjAngleValueModel ang;

  private AdjPoint2DModel pos;

  public ConnectionSiteBuilder() {
  }

  public ConnectionSiteBuilder setAng(AdjAngleValueModel ang) {
    this.ang = ang;
    return this;
  }

  public ConnectionSiteBuilder setPos(AdjPoint2DModel pos) {
    this.pos = pos;
    return this;
  }

  public ConnectionSiteBuilder from(ConnectionSiteModel value) {
    this.ang = value.getAng();
    this.pos = value.getPos();
    return this;
  }

  public ConnectionSiteModel build() {
    return new ConnectionSiteModel(this.ang, this.pos);
  }
}
