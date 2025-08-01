package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjAngleValueModel;
import com.scell.model.drawingml.main.AdjPoint2DModel;
import com.scell.model.drawingml.main.ConnectionSiteModel;

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

  public ConnectionSiteModel build() {
    return new ConnectionSiteModel(this.ang, this.pos);
  }

  public ConnectionSiteBuilder from(ConnectionSiteModel value) {
    this.ang = value.getAng();
    this.pos = value.getPos();
    return this;
  }
}
