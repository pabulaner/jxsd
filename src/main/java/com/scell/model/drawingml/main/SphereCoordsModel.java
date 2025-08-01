package com.scell.model.drawingml.main;

public class SphereCoordsModel {
  private final PositiveFixedAngleValueModel lat;

  private final PositiveFixedAngleValueModel rev;

  private final PositiveFixedAngleValueModel lon;

  public SphereCoordsModel(PositiveFixedAngleValueModel lat, PositiveFixedAngleValueModel rev,
      PositiveFixedAngleValueModel lon) {
    this.lat = lat;
    this.rev = rev;
    this.lon = lon;
  }

  public PositiveFixedAngleValueModel getLat() {
    return this.lat;
  }

  public PositiveFixedAngleValueModel getRev() {
    return this.rev;
  }

  public PositiveFixedAngleValueModel getLon() {
    return this.lon;
  }
}
