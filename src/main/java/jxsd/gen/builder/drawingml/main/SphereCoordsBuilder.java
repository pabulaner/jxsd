package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.SphereCoordsModel;

/**
 * This is a generated sequence class.
 */
public class SphereCoordsBuilder {
  private int lat;

  private int rev;

  private int lon;

  public SphereCoordsBuilder() {
  }

  public SphereCoordsBuilder setLat(int lat) {
    this.lat = lat;
    return this;
  }

  public SphereCoordsBuilder setRev(int rev) {
    this.rev = rev;
    return this;
  }

  public SphereCoordsBuilder setLon(int lon) {
    this.lon = lon;
    return this;
  }

  public SphereCoordsBuilder from(SphereCoordsModel value) {
    this.lat = value.getLat();
    this.rev = value.getRev();
    this.lon = value.getLon();
    return this;
  }

  public SphereCoordsModel build() {
    return new SphereCoordsModel(this.lat, this.rev, this.lon);
  }
}
