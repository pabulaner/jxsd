package com.scell.model.drawingml.main;

public class GeomRectModel {
  private final AdjCoordinateModel l;

  private final AdjCoordinateModel t;

  private final AdjCoordinateModel r;

  private final AdjCoordinateModel b;

  public GeomRectModel(AdjCoordinateModel l, AdjCoordinateModel t, AdjCoordinateModel r,
      AdjCoordinateModel b) {
    this.l = l;
    this.t = t;
    this.r = r;
    this.b = b;
  }

  public AdjCoordinateModel getL() {
    return this.l;
  }

  public AdjCoordinateModel getT() {
    return this.t;
  }

  public AdjCoordinateModel getR() {
    return this.r;
  }

  public AdjCoordinateModel getB() {
    return this.b;
  }
}
