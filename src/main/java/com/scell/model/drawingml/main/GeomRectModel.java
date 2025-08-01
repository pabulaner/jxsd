package com.scell.model.drawingml.main;

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
