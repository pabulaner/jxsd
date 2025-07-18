package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_SphereCoordsModel;
import com.scell.model.drawingml.main.ST_PositiveFixedAngleModel;

public class CT_SphereCoordsBuilder {
  private ST_PositiveFixedAngleModel lat;

  private ST_PositiveFixedAngleModel rev;

  private ST_PositiveFixedAngleModel lon;

  public CT_SphereCoordsBuilder() {
  }

  public CT_SphereCoordsBuilder setLat(ST_PositiveFixedAngleModel lat) {
    this.lat = lat;
    return this;
  }

  public CT_SphereCoordsBuilder setRev(ST_PositiveFixedAngleModel rev) {
    this.rev = rev;
    return this;
  }

  public CT_SphereCoordsBuilder setLon(ST_PositiveFixedAngleModel lon) {
    this.lon = lon;
    return this;
  }

  public CT_SphereCoordsModel build() {
    return new CT_SphereCoordsModel(this.lat, this.rev, this.lon);
  }

  public CT_SphereCoordsBuilder from(CT_SphereCoordsModel value) {
    this.lat = value.getLat();
    this.rev = value.getRev();
    this.lon = value.getLon();
    return this;
  }
}
