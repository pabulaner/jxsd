package com.scell.model.drawingml.main;

public class SphereCoordsModel {
  private final PositiveFixedAngleModel lat;

  private final PositiveFixedAngleModel rev;

  private final PositiveFixedAngleModel lon;

  public SphereCoordsModel(PositiveFixedAngleModel lat, PositiveFixedAngleModel rev,
      PositiveFixedAngleModel lon) {
    this.lat = lat;
    this.rev = rev;
    this.lon = lon;
  }

  public PositiveFixedAngleModel getLat() {
    return this.lat;
  }

  public PositiveFixedAngleModel getRev() {
    return this.rev;
  }

  public PositiveFixedAngleModel getLon() {
    return this.lon;
  }
}
