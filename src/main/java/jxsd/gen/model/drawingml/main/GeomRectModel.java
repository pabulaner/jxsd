package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.GeomRectBuilder;

/**
 * This is a generated sequence class.
 */
public class GeomRectModel {
  private final AdjCoordinateValueModel l;

  private final AdjCoordinateValueModel t;

  private final AdjCoordinateValueModel r;

  private final AdjCoordinateValueModel b;

  public GeomRectModel(AdjCoordinateValueModel l, AdjCoordinateValueModel t,
      AdjCoordinateValueModel r, AdjCoordinateValueModel b) {
    this.l = l;
    this.t = t;
    this.r = r;
    this.b = b;
  }

  public GeomRectBuilder builder() {
    return new GeomRectBuilder().from(this);
  }

  public AdjCoordinateValueModel getL() {
    return this.l;
  }

  public AdjCoordinateValueModel getT() {
    return this.t;
  }

  public AdjCoordinateValueModel getR() {
    return this.r;
  }

  public AdjCoordinateValueModel getB() {
    return this.b;
  }
}
