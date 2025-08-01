package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedAngleValueModel;
import com.scell.model.drawingml.main.SphereCoordsModel;

public class SphereCoordsBuilder {
  private PositiveFixedAngleValueModel lat;

  private PositiveFixedAngleValueModel rev;

  private PositiveFixedAngleValueModel lon;

  public SphereCoordsBuilder() {
  }

  public SphereCoordsBuilder setLat(PositiveFixedAngleValueModel lat) {
    this.lat = lat;
    return this;
  }

  public SphereCoordsBuilder setRev(PositiveFixedAngleValueModel rev) {
    this.rev = rev;
    return this;
  }

  public SphereCoordsBuilder setLon(PositiveFixedAngleValueModel lon) {
    this.lon = lon;
    return this;
  }

  public SphereCoordsModel build() {
    return new SphereCoordsModel(this.lat, this.rev, this.lon);
  }

  public SphereCoordsBuilder from(SphereCoordsModel value) {
    this.lat = value.getLat();
    this.rev = value.getRev();
    this.lon = value.getLon();
    return this;
  }
}
