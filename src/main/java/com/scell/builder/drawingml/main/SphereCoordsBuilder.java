package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedAngleModel;
import com.scell.model.drawingml.main.SphereCoordsModel;

public class SphereCoordsBuilder {
  private PositiveFixedAngleModel lat;

  private PositiveFixedAngleModel rev;

  private PositiveFixedAngleModel lon;

  public SphereCoordsBuilder() {
  }

  public SphereCoordsBuilder setLat(PositiveFixedAngleModel lat) {
    this.lat = lat;
    return this;
  }

  public SphereCoordsBuilder setRev(PositiveFixedAngleModel rev) {
    this.rev = rev;
    return this;
  }

  public SphereCoordsBuilder setLon(PositiveFixedAngleModel lon) {
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
