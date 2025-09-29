package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.SphereCoordsBuilder;

/**
 * This is a generated sequence class.
 */
public class SphereCoordsModel {
  private final int lat;

  private final int rev;

  private final int lon;

  public SphereCoordsModel(int lat, int rev, int lon) {
    this.lat = lat;
    this.rev = rev;
    this.lon = lon;
  }

  public SphereCoordsBuilder builder() {
    return new SphereCoordsBuilder().from(this);
  }

  public int getLat() {
    return this.lat;
  }

  public int getRev() {
    return this.rev;
  }

  public int getLon() {
    return this.lon;
  }
}
